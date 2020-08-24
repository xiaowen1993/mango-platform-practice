package cn.siques.mangosocketio.handler;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.ObjectUtil;
import cn.siques.mangocommon.utils.JwtTokenUtils;
import cn.siques.mangosocketio.config.DbTemplate;
import cn.siques.mangosocketio.config.Event;
import cn.siques.mangosocketio.payload.BroadcastMessageRequest;
import cn.siques.mangosocketio.payload.GroupMessageRequest;
import cn.siques.mangosocketio.payload.JoinRequest;
import cn.siques.mangosocketio.payload.SingleMessageRequest;
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnEvent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
@Slf4j
public class MessageEventHandler {
    // sockerserver
    @Autowired
    private SocketIOServer server;

    // 数据库
    @Autowired
    private DbTemplate dbTemplate;

    @OnConnect
    public void onConnect(SocketIOClient client){
        if(client !=null){
            String token = client.getHandshakeData().getSingleUrlParam("token");

            String username = JwtTokenUtils.getUsernameFromToken(token);

            UUID sessionId = client.getSessionId();
            dbTemplate.save(username,sessionId);
            log.info("连接成功,【token】= {},【sessionId】= {}", username, sessionId);

            client.sendEvent("connection",new Dict().create().set("username",username));
        }else{
            log.error("客户端为空");
        }
    }

    /**
     * 加入群聊
     * @param client
     * @param request
     * @param data
     */
    @OnEvent(value = Event.JOIN)
    public void onJoinEvent(SocketIOClient client, AckRequest request, JoinRequest data){
        log.info("用户：{} 已加入群聊：{}", data.getUserId(), data.getGroupId());
        // 客户端加入房间
        client.joinRoom(data.getGroupId());
        server.getRoomOperations(data.getGroupId()).sendEvent(Event.JOIN,data);
    }


    /**
     * 私聊
     * @param client
     * @param request
     * @param data
     */
    @OnEvent(value = Event.CHAT)
    public void onChatEvent(SocketIOClient client, AckRequest request, SingleMessageRequest data){
        Optional<UUID> toUser = dbTemplate.findByUserId(data.getToUid());
        if(toUser.isPresent()){
            log.info("用户 {} 刚刚私信了用户 {}：{}", data.getFromUid(), data.getToUid(), data.getMessage());
            sendToSingle(toUser.get(), data);
            // 返回消息给前端
            request.sendAckData(Dict.create().set("flag", true).set("message", "发送成功"));
        }{
            request.sendAckData(Dict.create()
                    .set("flag", false)
                    .set("message", "发送失败，对方不想理你(" + data.getToUid() + "不在线)"));
        }
    }

    @OnEvent(value = Event.GROUP)
    public void onGroupEvent(SocketIOClient client, AckRequest request, GroupMessageRequest data){
        Collection<SocketIOClient> clients = server.getRoomOperations(data.getGroupId()).getClients();
        boolean inGroup = false;
        for (SocketIOClient socketIOClient : clients) {
            if (ObjectUtil.equal(socketIOClient.getSessionId(), client.getSessionId())) {
                inGroup = true;
                break;
            }
        }
        if (inGroup) {
            log.info("群号 {} 收到来自 {} 的群聊消息：{}", data.getGroupId(), data.getFromUid(), data.getMessage());
            sendToGroup(data);
        } else {
            request.sendAckData("请先加群！");
        }
    }


    /**
     * 单聊,前端 socket.on('chat') 收到返回的消息
     */
    public void sendToSingle(UUID sessionId, SingleMessageRequest message) {
        server.getClient(sessionId).sendEvent(Event.CHAT, message);
    }

    public void sendToBroadcast(BroadcastMessageRequest message){
        log.info("系统紧急广播一条通知：{}",message.getMessage());
        for (UUID uuid : dbTemplate.findAll()) {
            if(server.getClient(uuid)==null){
                continue;
            }
            server.getClient(uuid).sendEvent(Event.BROADCAST,message);
        }
    }

    /**
     * 群聊
     */
    public void sendToGroup(GroupMessageRequest message) {
        server.getRoomOperations(message.getGroupId()).sendEvent(Event.GROUP, message);
    }


}

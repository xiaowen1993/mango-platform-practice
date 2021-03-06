package cn.siques.mango.controller;



import cn.siques.dto.MailDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sys/v1/pub/mail")
public class SysMailController {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("send")
    @PreAuthorize("hasAuthority('sys:mail:send')")
    public void sendMail(@RequestBody MailDto mailDto){
        System.out.println(mailDto);
//        MessageProperties messageProperties = new MessageProperties();
//        messageProperties.setContentType("application/json");
//        Message message = new Message(mailDto.toString().getBytes(), messageProperties);
        rabbitTemplate.convertAndSend("ampq.mail","mail",mailDto);
//        rabbitTemplate.convertAndSend("ampq.exchage","amqp",mailDto);
    }
}

package cn.siques.mango.service.impl;

import cn.siques.Page.MybatisPageHelper;
import cn.siques.Page.PageRequest;
import cn.siques.Page.PageResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.siques.mango.entity.SysDictData;
import cn.siques.mango.dao.SysDictDataMapper;
import cn.siques.mango.service.SysDictDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 字典数据表
 * </p>
 *
 * @package: cn.siques.mangosound.service.impl
 * @description: 字典数据表
 * @author: Shenghao.He
 * @date: Created in 2020-09-03 11:29:19
 * @copyright: Copyright (c) 2020
 * @version: V1.0
 * @modified: Shenghao.He
 */
@Service
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements SysDictDataService {


    @Resource
    SysDictDataMapper sysDictDataMapper;

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        PageResult page = MybatisPageHelper.findPage(pageRequest, sysDictDataMapper);
        return page;
    }

    @Override
    //todo
    public List<SysDictData> listKeyByType(String dictType) {
        QueryWrapper<SysDictData> wrapper = new QueryWrapper<>();
        wrapper.eq("dict_type",dictType);
        List<SysDictData> list = sysDictDataMapper.selectList(wrapper);

        List<SysDictData> parent = list.stream().filter(sysDictData ->
                sysDictData.getParentCode().equals("0")).collect(Collectors.toList());

        List<SysDictData>  res= findChildren(list,parent);

        System.out.println(res);
        return res;
    }

    private List<SysDictData> findChildren(List<SysDictData>  list,List<SysDictData> parent) {
        parent.forEach(sysDictData -> {
            // 子节点集合
            List<SysDictData> collect = list.stream()
                  .filter(sys -> sys.getParentCode()
                          .equals(sysDictData.getDictCode()))
                                .collect(Collectors.toList());
            sysDictData.setChildren(collect);
            findChildren(list,collect);
                }

        );

        return parent;
    }
}

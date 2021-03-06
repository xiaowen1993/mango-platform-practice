package cn.central.dao;


import cn.central.entity.SysDictData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 * 字典数据表
 * </p>
 *
 * @package:  cn.siques.mangosound.mapper
 * @description: 字典数据表
 * @author: Shenghao.He
 * @date: Created in 2020-09-03 11:29:19
 * @copyright: Copyright (c) 2020
 * @version: V1.0
 * @modified: Shenghao.He
 */
@Repository
public interface SysDictDataMapper extends BaseMapper<SysDictData> {


}

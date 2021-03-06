package cn.siques.mango.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.siques.dto.JsonData;

import cn.siques.Page.PageRequest;
import cn.siques.Page.PageResult;
import cn.siques.mango.entity.SysDictData;
import cn.siques.mango.service.SysDictDataService;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

/**
 * <p>
 * 字典数据表
 * </p>
 *
 * @package:  cn.siques.mangosound.controller
 * @description: 字典数据表
 * @author: Shenghao.He
 * @date: Created in 2020-09-03 11:29:19
 * @copyright: Copyright (c) 2020
 * @version: V1.0
 * @modified: Shenghao.He
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/sys/v1/pri/sysDictData")
@Api(description = "SysDictDataController", tags = {"字典数据接口"})
public class SysDictDataController {

    @Autowired
    SysDictDataService sysDictDataService;


    /**
   * 分页查询字典数据表
   * @param pageRequest
   * @return
   */
    @PostMapping("findPage")
    @ApiOperation(value = "分页查询字典数据表", notes = "分页查询字典数据表")
    public JsonData listSysRoleMenu(@RequestBody PageRequest pageRequest) {
        PageResult page = sysDictDataService.findPage(pageRequest);
        return JsonData.buildSuccess(page);
    }


    /**
     * 通过id查询字典数据表
     * @param dictCode id
     * @return JsonData
     */
    @GetMapping("/{dictCode}")
    @ApiOperation(value = "通过id查询字典数据表", notes = "通过id查询字典数据表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictCode", value = "主键id", required = true)
    })
    public JsonData getSysDictData(@PathVariable("dictCode") String dictCode){
      return  JsonData.buildSuccess(sysDictDataService.getById(dictCode));
    }

    /**
     * 新增字典数据表
     * @param sysDictData 字典数据表
     * @return JsonData
     */
    @PreAuthorize("hasAuthority('sys:dict:add')")
    @PostMapping
    @ApiOperation(value = "新增字典数据表", notes = "新增字典数据表")
    public JsonData saveSysDictData(@RequestBody SysDictData sysDictData){
      return  JsonData.buildSuccess(sysDictDataService.save(sysDictData));
    }

    /**
     * 修改字典数据表
     * @param dictCode id
     * @param sysDictData 字典数据表
     * @return JsonData
     */
    @PutMapping("/{dictCode}")
    @ApiOperation(value = "修改字典数据表", notes = "修改字典数据表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictCode", value = "主键id", required = true)
    })
    public JsonData updateSysDictData(@PathVariable String dictCode, @RequestBody SysDictData sysDictData){
      return  JsonData.buildSuccess(sysDictDataService.updateById(sysDictData));
    }

    /**
     * 通过id删除字典数据表
     * @param dictCode id
     * @return JsonData
     */
    @DeleteMapping("/{dictCode}")
    @ApiOperation(value = "删除字典数据表", notes = "删除字典数据表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dictCode", value = "主键id", required = true)
    })
    public JsonData deleteSysDictData(@PathVariable String dictCode){
      return  JsonData.buildSuccess(sysDictDataService.removeById(dictCode));
    }

}

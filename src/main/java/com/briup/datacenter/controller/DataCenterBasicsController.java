package com.briup.datacenter.controller;

import com.briup.datacenter.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @program: datacenter
 * @description: 数据集基础模块，只用来存储数据
 * @author: zhangcg
 * @create: 2020-12-09 23:33
 **/
@RestController
@RequestMapping(value = "basics",headers = {"Content-Type=application/json"})
@Api(tags = {"datacenter基础控制器"})
public class DataCenterBasicsController {

    int a = 10;

    @ApiOperation("新建数据集接口")
    @ApiImplicitParams(
            @ApiImplicitParam(name="type",value = "用来表示状态",dataType = "String")
    )
    @PostMapping("/datasets")
    public Message createDataSet(@RequestParam("type") String type){
        return  null;
    }

    @DeleteMapping("/datasets")
    public Message deleteDataSet(@PathVariable("dataset_id") String id){
        return null;
    }


}

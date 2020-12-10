package com.briup.datacenter.controller;

import com.briup.datacenter.utils.Message;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: datacenter
 * @description: JAVA版的数据集门面，主要用来实现关联关系和业务逻辑
 * @author: zhangcg
 * @create: 2020-12-09 23:17
 **/
@RestController
@RequestMapping(value = "facade",headers = {"Content-Type=application/json"})
@Api(tags = {"datacenter门面控制器"})
public class DataCenterFacadeController {

    int a  = 10;

    @PostMapping("/datasets")
    public Message createDataSet(){
        return  null;
    }


}

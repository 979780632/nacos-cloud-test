package com.nacos.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanSen Liu
 * @version 1.0
 * @date 2022/6/21 14:02
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String test(){
        return "当前访问项目端口："+port;
    }
}

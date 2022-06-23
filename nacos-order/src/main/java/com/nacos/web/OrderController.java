package com.nacos.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author YanSen Liu
 * @version 1.0
 * @date 2022/6/21 14:02
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String get(){
        // 使用服务名即可发起调用
        return restTemplate.getForObject("http://nacosclient/test", String.class);
    }
}

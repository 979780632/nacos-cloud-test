package com.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YanSen Liu
 * @version 1.0
 * @date 2022/6/21 14:01
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication01.class);
    }
}

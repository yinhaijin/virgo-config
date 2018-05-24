package com.lunzhiyu.virgo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by yhj on 2018/3/28.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class VirgoConfigApplication {
    public static void main(String[] args){
        SpringApplication.run(VirgoConfigApplication.class, args);
    }
}

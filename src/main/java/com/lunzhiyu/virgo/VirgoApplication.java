package com.lunzhiyu.virgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by yhj on 2018/3/28.
 */
@SpringBootApplication
@EnableConfigServer
public class VirgoApplication {
    public static void main(String[] args){
        SpringApplication.run(VirgoApplication.class, args);
    }
}

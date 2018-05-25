package com.lunzhiyu.virgo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 在application.yml中有个git.uri的配置，目前配置的是https://github.com/yinhaijin/config-repo
 * 获取git上的资源信息遵循如下规则：
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 *
 * 例如本例：可使用以下路径来访问{application}-dev.properties：
 * http://localhost:8040/{application}-dev.properties
 * http://localhost:8040/{application}/dev
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

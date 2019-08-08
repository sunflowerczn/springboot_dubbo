package com.sunflower.dubboproviderquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})  //导入dubbo配置
@EntityScan("com.sunflower.dubboapi.model")
public class DubboProviderQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderQueryApplication.class, args);
    }

}

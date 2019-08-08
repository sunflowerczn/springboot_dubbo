package com.sunflower.dubboprovidermodify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
@EntityScan("com.sunflower.dubboapi.model")
public class DubboProviderModifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderModifyApplication.class, args);
    }

}

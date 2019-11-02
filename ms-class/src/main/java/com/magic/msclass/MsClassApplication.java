package com.magic.msclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/11/2.
 */
@SpringBootApplication
public class MsClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsClassApplication.class);
    }

    /**
     * spring web提供的轻量级http client
     * <bean id="restTemplate" class="org.springframework.web.client.RestTemplate"/>
     *
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

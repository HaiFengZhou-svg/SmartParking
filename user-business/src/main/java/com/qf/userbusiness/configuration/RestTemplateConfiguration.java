package com.qf.userbusiness.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 访问模块与模块之间的通信 RestTemplate springboot会有集成 但是没有在容器里面创建
 * 创建Configuration 配置文件类 + @Bean
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate createRestTemplate() {

        return new RestTemplate();
    }
}

package com.fastcampus.springbootpractice.config;

import com.fastcampus.springbootpractice.properties.MyProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slayra
 * @date 2022-03-31
 **/
@Configuration
public class Config {

    /*@ConfigurationProperties("my")
    @Bean
    public MyProperties myProperties() {
        return new MyProperties();
    }*/
}

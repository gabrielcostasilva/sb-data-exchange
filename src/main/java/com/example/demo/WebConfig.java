package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Configuration(proxyBeanMethods = false)
public class WebConfig {

    @Bean
    ObjectMapper mapper(YAMLFactory yamlFactory) {
        return new ObjectMapper(yamlFactory);
    }

    @Bean
    YAMLFactory yamlFactory() {
        return new YAMLFactory();

    }
    
}

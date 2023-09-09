package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;

@Configuration(proxyBeanMethods = false)
public class WebConfig {

    @Bean
    ObjectMapper mapper(XmlFactory xmlFactory) {
        return new ObjectMapper(xmlFactory);
    }

    @Bean
    XmlFactory xmlFactory() {
        return new XmlFactory();

    }
    
}

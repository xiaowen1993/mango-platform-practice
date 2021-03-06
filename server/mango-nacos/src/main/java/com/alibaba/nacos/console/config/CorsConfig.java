package com.alibaba.nacos.console.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods("POST","GET","PUT","OPTION","DELETE")
                .maxAge(16800)
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

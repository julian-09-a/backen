package com.betabyte.back.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class corsConfigure implements WebMvcConfigurer {


@Override
public void addCorsMappings(CorsRegistry registry){
    registry
    .addMapping("/**")
    .allowedMethods("*")
    .allowedMethods("GET", "POST", "PATCH", "DELETE", "PUT", "OPTIONS")
    .allowedHeaders("*");
}

}

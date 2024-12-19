package com.iranna.annotaionAndJavaConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iranna..annotaionAndJavaConfig")  // Adjust the package as needed
public class ServiceConfig {
}


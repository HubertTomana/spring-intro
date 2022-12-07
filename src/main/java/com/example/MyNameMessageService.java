package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class MyNameMessageService implements MessageService {

    @Bean
    public String getMessage() {
        return "Hubert Tomana";
    }
}

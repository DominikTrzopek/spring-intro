package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNameMessageService implements MessageService {
    String expectedMessage = "Dominik Trzópek";

    @Override @Bean
    public String getMessage() {
        return expectedMessage;
    }
}

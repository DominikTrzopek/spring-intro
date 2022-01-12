package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class RandomTextMessageService implements MessageService {
    String[] messages = {"wiadomość 1","wiadomość 2","wiadomość 3","wiadomość 4","wiadomość 5",
            "wiadomość 6","wiadomość 7","wiadomość 8","wiadomość 9","wiadomość 10"};


    @Override @Bean
    public String getMessage() {
        int rand = (int) ((Math.random() * (9)));
        return messages[rand];
    }
}

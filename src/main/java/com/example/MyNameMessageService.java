package com.example;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    String expectedMessage = "Dominik Trzópek";

    @Override
    public String getMessage() {
        return expectedMessage;
    }
}

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RandomTextMessageService.class);

        MessageService messageService = ctx.getBean(MessageService.class);

        System.out.println(messageService.getMessage());

    }
}


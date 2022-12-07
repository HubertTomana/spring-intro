package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService secondMessageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService thirdMessageService = applicationContext.getBean("messageService1", MessageService.class);

        System.out.println("First messageService : " + messageService.hashCode());
        System.out.println("Second messageService : " + secondMessageService.hashCode());
        System.out.println("Third messageService : " + thirdMessageService.hashCode());


        System.out.println(messageService.getMessage());
        System.out.println(secondMessageService.getMessage());
        System.out.println(thirdMessageService.getMessage());

        applicationContext.close();
    }
}

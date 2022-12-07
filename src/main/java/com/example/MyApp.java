package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyNameMessageService.class);
        MessageService messageService = applicationContext.getBean(MessageService.class);
        MessageService secondMessageService = applicationContext.getBean(MessageService.class);
        //MessageService thirdMessageService = applicationContext.getBean("messageService1", MessageService.class);

        System.out.println("First messageService : " + messageService.hashCode());
        System.out.println("Second messageService : " + secondMessageService.hashCode());
        //System.out.println("Third messageService : " + thirdMessageService.hashCode());


        System.out.println(messageService.getMessage());
        System.out.println(secondMessageService.getMessage());
        //System.out.println(thirdMessageService.getMessage());

        ApplicationContext RandomApplicationContext = new AnnotationConfigApplicationContext(RandomTextMessageService.class);
        MessageService randomMessageService = RandomApplicationContext.getBean(MessageService.class);
        MessageService randomSecondMessageService = RandomApplicationContext.getBean(MessageService.class);

        System.out.println("First randomMessageService : " + randomMessageService.hashCode());
        System.out.println("Second randomMessageService : " + randomSecondMessageService.hashCode());

        System.out.println(randomMessageService.getMessage());
        System.out.println(randomMessageService.getMessage());

        //applicationContext.close();
    }
}

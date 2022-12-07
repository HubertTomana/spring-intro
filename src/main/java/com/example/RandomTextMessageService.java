package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Configuration
public class RandomTextMessageService implements MessageService {

    String[] array = {"Ola", "Ania", "Biurko", "Pole", "Komputer", "Myszka", "Kamil", "Klawiatura", "Sufit", "Oczy"};
    @Bean
    public String getMessage() {
        int random = new Random().nextInt(10);
        return array[random];
    }
}

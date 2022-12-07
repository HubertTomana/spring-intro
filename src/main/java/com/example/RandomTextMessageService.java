package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("messageService1")
public class RandomTextMessageService implements MessageService {

    String[] array = {"Ola", "Ania", "Biurko", "Pole", "Komputer", "Myszka", "Kamil", "Klawiatura", "Sufit", "Oczy"};
    @Override
    public String getMessage() {
        int random = new Random().nextInt(10);
        return array[random];
    }
}

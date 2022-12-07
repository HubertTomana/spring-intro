package com.example;

import java.util.Random;

public class RandomTextMessageService implements MessageService {

    String[] array = {"Ola", "Ania", "Biurko", "Pole", "Komputer", "Myszka", "Kamil", "Klawiatura", "Sufit", "Oczy"};
    @Override
    public String getMessage() {
        int random = new Random().nextInt(10);
        return array[random];
    }
}

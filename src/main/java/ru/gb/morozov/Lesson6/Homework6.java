package ru.gb.morozov.Lesson6;

import java.util.Random;

public class Homework6 {

    int count = 0;
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурзик", 12, 5),
                new Dog("Бобик", 14, 3),
        };
        final Random random = new Random();
        for (Animal animal : animals) {

            animal.swim(random.nextInt(600));
            animal.run(random.nextInt(20));
        }
        for (int i = 0; i <= animals.length; i++) {
            if (i == animals.length) {
                System.out.println("Число животных:" + i);
            }
        };



    }
}

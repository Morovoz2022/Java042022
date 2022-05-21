package ru.gb.morozov.Lesson6;

public class Dog extends Animal {
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run(int lenght) {
        if (lenght > 500) {
            System.out.println("Собака не умеет бегать на расстояние" + lenght);
        }
        else {
            System.out.println("Собака пробежала:" + lenght);
        }
    }

    @Override
    public void swim(int lenght) {
        if (lenght > 10) {
            System.out.println("Собака не умеет плавать на расстояние" + lenght);
        }
        else {
            System.out.println("Собака проплыла:" + lenght);
        }

    }
}

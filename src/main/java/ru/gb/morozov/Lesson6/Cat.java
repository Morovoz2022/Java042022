package ru.gb.morozov.Lesson6;

public class Cat extends Animal {
    public static Object swim;


    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run(int lenght) {
        if (lenght > 200) {
            System.out.println("Кот не умеет бегать на длинну" + lenght);
        }
        else {
            System.out.println("Кот пробежал на расстояние:" + lenght);
        }

    }

    @Override
    public void swim(int lenght) {
        System.out.println("Кот не умеет плавать");
    }
}

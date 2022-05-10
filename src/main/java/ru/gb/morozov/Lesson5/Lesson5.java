package ru.gb.morozov.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        int a1 = 1;
        User u1 = new User(); // объект (создаётся в куче /heap)
        User u2 = new User();
        u1.firstname = "Иван";
        u1.age = 70;
        u2.firstname = "Пётр";
        u2.age = 20;

        System.out.println("u2.name = " + u2.firstname);
        System.out.println("u2.age = " + u2.age);
        System.out.println("u1.firstname = " + u1.firstname);
        System.out.println("u1.name = " + u1.firstname);


    }
}

package ru.gb.morozov.Lesson9;

public class Treadmill {
    public int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }
    public int bot_jump_wall(Bot a) {
        int b;
        if (a.run_limit >= lenght) {
            System.out.println("Робот пробежал дорожку");
            b = 1;
        }
        else {
            System.out.println("Робот не пробежал дорожку");
            b = 0;

        }
        return b;
    }

    public int Cat_jump_wall(Cat a) {
        int b;
        if (a.run_limit >= lenght) {
            System.out.println("Кот пробежал дорожку");
            b = 1;
        }
        else {
            System.out.println("Кот не пробежал дорожку");
            b = 0;

        }
        return b;
    }

    public int people_jump_wall(People a) {
        int b;
        if (a.run_limit >= lenght) {
            System.out.println("Человек пробежал дорожку");
            b = 1;
        }
        else {
            System.out.println("Человек не пробежал дорожку");
            b = 0;
        }
        return b;
    }
}

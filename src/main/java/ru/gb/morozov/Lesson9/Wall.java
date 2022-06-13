package ru.gb.morozov.Lesson9;

public class Wall {
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    public int bot_jump_wall(Bot a) {
        int b;
        if (a.jump_limit >= height) {
            System.out.println("Робот перепрыгнул стену");
            b = 1;
        }
        else {
            System.out.println("Робот не перепрыгнул стену");
            b = 0;
        }
        return b;
    }

    public int Cat_jump_wall(Cat a) {
        int b;
        if (a.jump_limit>= height) {
            System.out.println("Кот перепрыгнул стену");
            b = 1;
        }
        else {
            System.out.println("Кот не перепрыгнул стену");
            b = 0;

        }
        return b;
    }

    public int people_jump_wall(People a) {
        int b;
        if (a.jump_limit >= height) {
            System.out.println("Человек перепрыгнул стену");
            b = 1;
        }
        else {
            System.out.println("Человек не перепрыгнул стену");
            b = 0;
        }
        return b;
    }
}

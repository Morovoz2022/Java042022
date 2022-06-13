package ru.gb.morozov.Lesson9;

public class People {
    public int jump_limit;
    public int run_limit;

    public People(int jump_limit, int run_limit) {
        this.jump_limit = jump_limit;
        this.run_limit = run_limit;
    }

    public void jump(){
        System.out.println("Человек прыгнул");
    }

}

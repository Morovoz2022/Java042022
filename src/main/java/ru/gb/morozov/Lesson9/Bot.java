package ru.gb.morozov.Lesson9;

public class Bot {
    public int jump_limit;
    public int run_limit;

    public Bot(int jump_limit, int run_limit) {
        this.jump_limit = jump_limit;
        this.run_limit = run_limit;
    }

    public void jump(){
        System.out.println("Робот прыгнул");
    }

}

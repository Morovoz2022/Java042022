package ru.gb.morozov.Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Количество еды " + food);
    }

    public void decreaseFood(int amount){
        food -= amount;
    }
    public void adding(int a){
        food += a;
    }
}

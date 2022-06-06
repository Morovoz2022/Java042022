package ru.gb.morozov.Lesson9;

public class Course {
    protected int springboard_height;
    protected int snake_lenght;

    public Course(int springboard_height, int snake_lenght) {
        this.springboard_height = springboard_height;
        this.snake_lenght = snake_lenght;
    }

    public int getSpringboard_height() {
        return springboard_height;
    }

    public void setSpringboard_height(int springboard_height) {
        this.springboard_height = springboard_height;
    }

    public int getSnake_lenght() {
        return snake_lenght;
    }

    public void setSnake_lenght(int snake_lenght) {
        this.snake_lenght = snake_lenght;
    }


}

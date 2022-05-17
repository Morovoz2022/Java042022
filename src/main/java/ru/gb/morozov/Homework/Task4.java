package ru.gb.morozov.Homework;

public class Task4 {
    public static void printColor(){
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }

    public static void main(String[] args) {
        printColor();
    }
}

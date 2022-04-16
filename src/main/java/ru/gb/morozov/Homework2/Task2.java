package ru.gb.morozov.Homework2;

public class Task2 {

    public static void check(int a){
        if (a > 0) {
            System.out.println("Положительное");
        }
        else if (a < 0){
            System.out.println("Отрицательное");
        }
    }

    public static void main(String[] args) {
        int a = -3;
        check(a);

    }
}

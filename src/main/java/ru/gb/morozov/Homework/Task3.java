package ru.gb.morozov.Homework;

public class Task3 {
    public static void checkSumSign(){
       int a = 3;
       int b = 4;
       if (a + b > 0) {
           System.out.println("Сумма положительная");
       }
       else if (a + b < 0) {
           System.out.println("Сумма отрицательная");
       }
    }
    public static void main(String[] args) {
        checkSumSign();
    }
}

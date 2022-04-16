package ru.gb.morozov.Homework2;

public class Task5 {

    public static boolean Year(int a){
        boolean s;
        if ((a % 4 == 0 && a % 100 != 0) ||  a % 400 == 0){
            s = true;
        }
        else {
            s = false;
        }
        return s;
    }

    public static void main(String[] args) {
        boolean s;
        s = Year(1640);
        System.out.println(s);

    }
}

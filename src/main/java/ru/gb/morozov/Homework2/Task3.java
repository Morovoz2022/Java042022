package ru.gb.morozov.Homework2;

public class Task3 {
    public static boolean chek(int a) {
        boolean s = false;
        if (a < 0) {
            s = true;

        } else if (a > 0) {
            s = false;
        }
        return s;
    }

    public static void main(String[] args) {
        int a = -123;
        boolean s = chek(a);
        System.out.println(s);
    }


}

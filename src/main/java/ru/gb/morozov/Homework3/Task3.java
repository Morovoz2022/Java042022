package ru.gb.morozov.Homework3;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < a.length; i++){
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
            System.out.println(a[i]);
        }
    }
}

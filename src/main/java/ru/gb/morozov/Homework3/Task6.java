package ru.gb.morozov.Homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int max = 0;
        int min = 10000;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}

package ru.gb.morozov.Homework3;

import java.util.Scanner;

public class Task5 {
    public static void massive(int len, int intialValue) {
        String[][] a = new String[len][intialValue];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = "initialValue";
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        massive(a, b);
        sc.close();





    }
}

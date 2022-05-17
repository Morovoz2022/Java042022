package ru.gb.morozov.Homework3;

public class Task4 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count1 = 1;
        int count2 = 5;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j ) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
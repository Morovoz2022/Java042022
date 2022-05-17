package ru.gb.morozov.Homework2;

public class Task1 {

    public static boolean chek(int a, int b){
        boolean s;
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            s =true;

        }
        else {
            s = false;
        }
        return s;
    }

    public static void main(String[] args) {
        boolean s = chek(12, 5);
        System.out.println(s);

    }
}

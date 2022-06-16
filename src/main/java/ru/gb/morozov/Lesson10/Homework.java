package ru.gb.morozov.Lesson10;

import static java.lang.Integer.valueOf;

public class Homework {



    public static int check_bag_and_sum(String[][] a) {
        int sum = 0;
        int lenght = 4;
        if (a.length != 4) {
            throw new MySizeArrayException(String.format("Размер массива должен быть %dх%d.", lenght, lenght));
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != 4) {
                throw new MySizeArrayException(String.format("Размер массива должна быть", lenght, lenght));
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                try {
                    sum += valueOf(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции  исходного массива находится не целое число"));
                }
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        String[][] a = new String[][]{
                {"4", "6", "3", "4"},
                {"1", "2", "3", "4"},
                {"10", "8", "5"},
                {"12", "2", "4", "8"}
        };

        try {
            System.out.println("Сумма элементов: " + check_bag_and_sum(a));
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e);


        }
    }
}



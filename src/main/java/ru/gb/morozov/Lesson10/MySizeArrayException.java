package ru.gb.morozov.Lesson10;

public class MySizeArrayException extends RuntimeException{

    MySizeArrayException(String msg) {
        super("Ошибка размерности массива.\n" + " " + msg);
    }

}

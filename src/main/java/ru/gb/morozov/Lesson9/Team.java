package ru.gb.morozov.Lesson9;

import java.util.Scanner;

public class Team {
    protected   String name;
    protected   int distance;
    protected   Sprotsmen sprotsmen;

    public Team(String name, int distance, Sprotsmen sprotsmen) {
        this.name = name;
        this.distance = distance;
        this.sprotsmen = sprotsmen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Sprotsmen getSprotsmen() {
        return sprotsmen;
    }

    public void setSprotsmen(Sprotsmen sprotsmen) {
        this.sprotsmen = sprotsmen;
    }

    public void check(Team a) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (a.getDistance() > b) {
            System.out.println("Имя команды:"  + a.getName() + "Игрок:" + a.getSprotsmen());
        }
        else {
            System.out.println("Спортсмен дистанцию не пробежал");
        }

    }
    public void info(Team a){
        System.out.println("Имя команды:"  + a.getName() + "Игрок:" + a.getSprotsmen() + "Дистанция" + a.getDistance());
    }
}

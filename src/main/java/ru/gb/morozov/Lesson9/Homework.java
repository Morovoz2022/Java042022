package ru.gb.morozov.Lesson9;

public class Homework {


    public static void main(String[] args) {
        Team[] teams = {
                new Team("Spartak", 3454, Sprotsmen.IVAN),
                new Team("Lokomotive", 464, Sprotsmen.PETER),
                new Team("Zenit", 2346, Sprotsmen.JOHN),
                new Team("CSKA", 300, Sprotsmen.TOM)

        };

        Course course1 = new Course(2, 400);



        for (int i = 0; i < teams.length; i++) {
            teams[i].check(teams[i]);
            teams[i].info(teams[i]);

            course1.pass_course(course1.make_course(course1.number_of_obstacles, course1.lenght), teams[i].getDistance());




        }





    }
}
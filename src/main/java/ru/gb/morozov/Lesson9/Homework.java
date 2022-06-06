package ru.gb.morozov.Lesson9;

public class Homework {

    public  static void  obstacle(Team a, Course b) {
        int n = 0;
        while (a.getDistance() > b.getSnake_lenght() || (a.getDistance() > b.getSpringboard_height())) {
            System.out.println("Спортсмен " + a.getName() + " прошёл змейку" + n + "ый раз");
             a.setDistance(a.getDistance() - b.getSnake_lenght());
             if (a.getDistance() > b.getSpringboard_height()) {
                 System.out.println("Спортсмен " + a.getName() + " прошёл трамплин" + n + "ый раз");
                 a.setDistance(a.getDistance() - b.getSpringboard_height());
                 n+=1;




            }
             else {
                 return;
             }

        };
        System.out.println("Cпортсмен устал");

    }
    public static void main(String[] args) {
        Team[] teams = {
                new Team("Spartak", 234, Sprotsmen.IVAN),
                new Team("Lokomotive", 556, Sprotsmen.PETER),
                new Team("Zenit", 234, Sprotsmen.JOHN),
                new Team("CSKA", 234, Sprotsmen.TOM)

        };
        Course course = new Course(23, 45);
        for (int i = 0; i < teams.length; i++) {
            teams[i].check(teams[i]);
            teams[i].info(teams[i]);
            obstacle(teams[i], course);



        }





    }
}
package ru.gb.morozov.Lesson9;

public class Course {
    public int  number_of_obstacles;
    public int lenght;

    public Course(int number_of_obstacles, int lenght) {
        this.number_of_obstacles = number_of_obstacles;
        this.lenght = lenght;
    }

    public  Course[]  make_course(int number_of_obstacles, int lenght) {
        Course[] courses = new Course[number_of_obstacles];
        for (int i = 0; i < courses.length; i += 1) {
            courses[i] = new Course(number_of_obstacles, lenght);





        }
        return courses;

    }

    public void pass_course(Course[] a, int forces) {
        for (int i = 0; i < a.length; i +=1) {
            int b = a[i].lenght;
            forces = forces - b;




        }
        if (forces >= 0) {
            System.out.println("Полоса препятствий пройдена");
        }
        else {
            System.out.println("Полоса препятствий не пройдена");
        }


    }
}

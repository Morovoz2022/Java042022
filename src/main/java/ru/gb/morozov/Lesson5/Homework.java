package ru.gb.morozov.Lesson5;


public class Homework {






    
    public static void main(String[] args) {
        Staff[] staffs = {
                new Staff("Артём", "Директор", "df4@list.ru", 81483, 100, 25),
                new Staff("Иван", "Заместитель директора", "df45@list.ru", 84565765, 200, 28),
                new Staff("Пётр","Программист", "dfe45@list.ru", 8353653, 150, 19),
                new Staff("Василий", "Программист", "de45354@list.ru", 83235423, 300, 56),
                new Staff("Алексей", "Программист", "de4543554@list.ru", 832354986, 300, 44),
        };

        for (Staff staff : staffs) {
            staff.print();
        }


        for (Staff staff : staffs) {
            if (staff.getAge() > 40) {
                System.out.println(staff.getName());
                System.out.println(staff.getSalary());
                System.out.println(staff.getEmail());
                System.out.println(staff.getPhone());


            }



        }


    }


}



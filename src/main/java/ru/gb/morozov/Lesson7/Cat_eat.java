package ru.gb.morozov.Lesson7;

public class Cat_eat {

    public static boolean check(Cat cat, Plate plate) {
        boolean a;
        if (cat.getAppetite() > plate.getFood()){
            a = false;
        }
        else {
            a = true;
        }
        return a;
    }



    public static void main(String[] args) {
        Cat cats[] = {
                new Cat("Барсик", 3),
                new Cat("Мурзик", 9),
                new Cat("Тишка", 8),
                new Cat("Толстик", 87)
        };
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (check(cats[i], plate) == true) {
                cats[i].eat(plate);
                plate.info();
                cats[i].setSatiety(true);

            }
            else {
                System.out.println("Еды слишком мало");
            }
            System.out.println("Сытость кота " +cats[i].getName() + " " + cats[i].isSatiety());

        }
        plate.adding(5);
        plate.info();



    }
}

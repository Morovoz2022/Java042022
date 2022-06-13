package ru.gb.morozov.Lesson9;

public class Homework {


    public static void main(String[] args) {
        Object objects[] = {
                new Cat(3, 50),
                new Bot(2, 100),
                new People(1, 200)
        };
        Object obstacles[] = {
                new Treadmill(100),
                new Wall(2),
        };

        int a;
        outer:

        for (int i = 0; i < objects.length; i++) {
            if ((objects[i] instanceof Cat)) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j] instanceof Treadmill) {
                        int b = ((Treadmill) obstacles[j]).Cat_jump_wall((Cat) objects[i]);
                        if (b == 0) {
                            continue outer;
                        }


                    } else if (obstacles[j] instanceof Wall) {
                        int b = ((Wall) obstacles[j]).Cat_jump_wall((Cat) objects[i]);
                        if (b == 0) {
                            continue outer;
                        }
                    }

                }


            }
            if ((objects[i] instanceof People)) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j] instanceof Treadmill) {
                        int b = ((Treadmill) obstacles[j]).people_jump_wall((People) objects[i]);
                        if (b == 0) {
                            continue outer;
                        }


                    } else if (obstacles[j] instanceof Wall) {
                        int b = ((Wall) obstacles[j]).people_jump_wall((People) objects[i]);
                        if (b == 0) {
                            continue outer;
                        }
                    }

                }
            }
            if ((objects[i] instanceof Bot)) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j] instanceof Treadmill) {
                        int b = ((Treadmill) obstacles[j]).bot_jump_wall((Bot) objects[i]);
                        if (b == 0) {
                            continue outer;
                        }


                    } else if (obstacles[j] instanceof Wall) {
                        int b = ((Wall) obstacles[j]).bot_jump_wall((Bot) objects[i]);
                        if (b == 0) {
                            continue outer;
                        }
                    }

                }


            }


        }
    }
}


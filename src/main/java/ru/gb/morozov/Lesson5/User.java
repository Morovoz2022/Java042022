package ru.gb.morozov.Lesson5;

//Принципы ООП
//0 - абстракция
//2 - Инкаспуляция
public class User {
    public String firstname; // класс (чертёж)->  объект
    public int age;
    private String lastname;
    private String email;
    private boolean male;

    //геттер - метод для чтения
    //сеттер - метод для записи

    //private - виден только классу
    //по умолчанию - виден только внутри пакета
    //protected - виден только внутри пакета + у наследников
    //public - виден всем
    

    public String getFirstname(){
        return firstname;
    }

    public int getAge(){
        return age;
    }

    public void setFirstname(String firstname1){
        firstname = firstname1;

    }


    public void setAge(int age1) {
        if (age1 > 0 && age1 < 250) {
            age = age1;
        }
    }

}


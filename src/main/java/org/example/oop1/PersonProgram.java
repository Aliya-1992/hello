package org.example.oop1;

public class PersonProgram {
    public static void main(String[] args) {
        Person sergey = new Person();
        sergey.info();

        sergey.age = 12;
        sergey.name = "Sergey";
        sergey.info();
        Person anton = new Person();
        anton.info();

        Person vlad = new Person("Vlad");
        vlad.info();

        Person alfred = new Person("Alfred", 15);
        alfred.info();

    }
}

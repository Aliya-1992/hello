package org.example.oop2;

public class PersonProgramm {
    public static void main(String[] args) {


        Person sergey = new Person("Sergey", "Gordeev");
        sergey.displayName();
        sergey.displaySurname();

        System.out.println(sergey.name);
        System.out.println(sergey.surname);

    }
}
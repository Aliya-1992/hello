package org.example.incapsulation;

public class PersonProgramm {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey", 12);
        System.out.println(sergey.getAge());
        sergey.setAge(-9);
        System.out.println(sergey.getAge());
    }
}

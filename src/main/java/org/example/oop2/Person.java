package org.example.oop2;

public class Person {
    String name;
    String surname;
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;}
    public void displayName(){
        System.out.println(name);
    }
    public void displaySurname(){
        System.out.println(surname);
    }

}



package org.example.fieldsst;

public class PersonProgramm {
    public static void main(String[] args) {


        Person sergey = new Person();
        sergey.displayNum1();
        System.out.println(Person.num2);
        Person.displayNum2();
        System.out.println(Operations.sum(9,89));
    }
}
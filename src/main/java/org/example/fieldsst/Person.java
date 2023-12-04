package org.example.fieldsst;

public class Person {
    private int num1;
    static int num2 = 10;
    Person(){
        num1=num2++;

    }
    public static void displayNum2(){
        System.out.println(num2);
    }
    public void displayNum1(){
        System.out.println(num1);
    }
}

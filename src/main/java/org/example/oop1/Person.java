package org.example.oop1;
import static java.lang.System.*;



public class Person {
    String name;
    int age;
    public void info(){
        out.println(name+age);
    }
    Person(){
        this("Standart", 12);
        //name = "Standart";
        //age = 12;

    }
    Person(String name){
        //name = name;
        //age = 12;
        this(name, 12);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

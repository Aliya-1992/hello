package oop6;

public class Person {
    String name;
    public String getName(){
        return name;
    }
    public Person(String name){
        this.name = name;
    }
    public void displayName(){

        System.out.println("Имя тользователя: "+ name);
    }
}

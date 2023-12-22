package oop5;

public abstract class Person {

    //public abstract void hand();

    //public abstract void jump();
    private String name;
    public String getName(){
        return name;
    }
    public Person(String name){
        this.name = name;
    }
    public abstract void display();
}

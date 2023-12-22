package oop4;

public class Employee extends Person{
    String surname;

    public Employee(String name, String surname){
        super(name);
        this.surname = surname;
    }
    public void displaySurname(){
        System.out.println("Фамилия пользователя: " + getName() + surname);
    }

    @Override
    public void displayName(){
        //System.out.println(getName());
        super.displayName();
        System.out.println(surname);

    }
}

package oop4;

public class Program {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey");
        sergey.displayName();
        Employee anton = new Employee("Anton ", "Antonov");
        anton.displayName();
        //anton.displaySurname();
    }
}

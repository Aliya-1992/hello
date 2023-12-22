package oop5;

public class Program {
    public static void main(String[] args) {
        Employee sergey = new Employee("Sergey", "Sber");
        sergey.display();
        Client anton = new Client("Anton", "Sber");
        anton.display();
    }
}

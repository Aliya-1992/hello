package oop6;

public class Program {
    public static void main(String[] args) {
    Person sergey = new Person("Sergey");
    Employee anton = new Employee("Anton", "Sber");


    Client alla = new Client("Alla", "Sber", 1200);
    Object alla1 = new Client("Alla", "Sber", 1200);
    Person alla2 = new Client("Alla", "Sber", 1200);
    Object anton1 = new Employee("Anton", "Sber");
    Employee anton2 = (Employee)anton1;
    anton2.display();
    System.out.println(anton2.getBank());
    Object valera = new Client("Valera", "Sber", 9000);
        ((Person)valera).displayName();

        Object igor = new Client("Igor", "Akbars", 12000);
        if (igor instanceof Employee){
            Employee employee = (Employee) igor;
            employee.display();
        }
        else {
            System.out.println("Перобразование невозможно");
        }
    }
}

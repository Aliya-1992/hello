package oop6;

public class Employee extends Person {
    private String bank;
    public Employee(String name, String bank){
        super(name);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void display(){
        System.out.println("Имя работника: "+ super.getName()+". Место работы сотрудника: "+bank);

    }
}

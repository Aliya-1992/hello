package oop5;

public class Client extends Person{
    private String bank;
    public Client(String name, String bank){
        super(name);
        this.bank = bank;

    }
    public void display(){
        System.out.println("Имя клиента: "+ super.getName()+". Банк: "+bank);
    }
}

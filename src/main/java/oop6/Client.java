package oop6;

public class Client extends Person {
    private String bank;
    private int sum;
    public Client(String name, String bank, int sum){
        super(name);
        this.bank = bank;
        this.sum = sum;

    }
    public void display(){
        System.out.println("Имя клиента: "+ super.getName()+". Банк: "+bank+ "Сумма: "+ sum);
    }
    public String getBank(){
        return bank;
    }

    public int getSum() {
        return sum;
    }
}

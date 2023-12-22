package oop16;

public class Program {
    public static void main(String[] args) {
        //Account <String, Double> account = new Account("12F", 23.0);
        //System.out.println(account.getId() + account.getSum());
    /*Account account1 = new Account<>("12d", 45000);
    Account account2 = new Account<>(12, 45005);
        System.out.println(account1.getId() + " " + account1.getSum());
        System.out.println(account2.getSum()+ account2.getSum());
    }*/
        Account account = new oop16.Account(13, 1200, 77);
        System.out.println(account.getId() + " "+account.getSum()+" "+account.getNewSum());
        String[] animals ={"Лев", "Кот"};
        account.print(animals);
    }
}

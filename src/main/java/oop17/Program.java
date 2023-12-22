package oop17;

public class Program {
    public static void main(String[] args) {
     Account sergey = new Account("23", 333);
     Account yan = new Account ("45", 777);
     Transaction<Account> transaction = new Transaction<>(sergey, yan, 20);
     transaction.execute();
     transaction = new Transaction<>(sergey, yan, 1000);
     transaction.execute();
    }
}

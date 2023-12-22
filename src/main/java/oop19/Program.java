package oop19;

public class Program {
    public static void main(String[] args) {
        Account account1 = new Account ("45r", 6789);
        Account account2 = new Account("yy7", 890);
        Transaction <Account> transaction = new Transaction<>(account1, account2, 89);
        transaction.execute();
    }
}

package ооз13;

public class Program {
    public static void main(String[] args) {
        Account account1 = new Account(999, 888);
        int account1Id = (int)account1.getId();
        System.out.println(account1.getId());
        System.out.println(account1Id);

        Account account2 = new Account("555", 999);
        System.out.println(account2.getId());
        int account2ID = (int)account2.getId();
        System.out.println(account2ID);

    }
}

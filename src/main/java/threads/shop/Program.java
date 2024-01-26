package threads.shop;

public class Program {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Customer customer = new Customer(shop);
        new Thread(producer).start();
        new Thread(customer).start();

    }


}

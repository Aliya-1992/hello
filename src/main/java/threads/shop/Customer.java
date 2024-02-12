package threads.shop;

public class Customer implements Runnable{
    Shop shop;
    public Customer(Shop shop){
        this.shop = shop;
    }


    @Override
    public void run() {
        for (int i = 1; i< 6; i++) {
           shop.get();
        }
    }
}

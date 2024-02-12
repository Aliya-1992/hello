package threads.shop;

public class Producer implements Runnable{
    Shop shop;
    public Producer(Shop shop){
        this.shop = shop;
    }


    @Override
    public void run() {
        for (int i = 1; i< 6; i++) {
        shop.add();
        }
    }

}

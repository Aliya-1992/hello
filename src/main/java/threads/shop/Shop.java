package threads.shop;

public class Shop {
    private int tovar = 0;
    public synchronized  void add(){
        while (tovar >=3){
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
        tovar++;
        System.out.println("поставщик добавил 1 товар");
        System.out.println("товаров на складе: "+tovar);
        notify();
    }

    public synchronized void get(){
        while (tovar<1){
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
        tovar--;
        System.out.println("Склад получил 1 товар");
        System.out.println("товаров на складе "+tovar);
        notify();

    }
}

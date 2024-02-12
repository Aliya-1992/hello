package oop7.semap;
import java.util.concurrent.Semaphore;


public class Sem {
    public static void main(String[] args) {
        Semaphore table =new Semaphore(2);

    }
}

class Person extends Thread{
    Semaphore table;

    @Override
    public void run() {
        super.run();
        System.out.println(this.getName()+"waiting for table");
    }
}

package threads;

public class InterruptThread extends Thread{
    InterruptThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + "начал работу");
        int counter = 1;
        while (!isInterrupted()){
            System.out.println("поток "+ counter++);
        }

        System.out.println(Thread.currentThread().getName() + "закончил работу");



    }

}

package threads;

public class OwnThread extends Thread{
    OwnThread(String name){
      super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()); //с помощьб данной конструкции мы понимаем какой поток выполняется
        try{
            Thread.sleep(300);
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

package HomeTask3.Task7;

public class TttThread extends Thread{
    private String n;
    TttThread(String name){
    n = name;
    }




    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
        try {
            for (int i = 1; i < 101; i++) {
                System.out.println(n);
                System.out.println(i);
            }} catch (Exception e) {
                System.out.println("Thread " + Thread.currentThread().getName() +"  interrupted.");
            }
        System.out.println("Thread " + Thread.currentThread().getName() + "  exiting.");
    }


        }



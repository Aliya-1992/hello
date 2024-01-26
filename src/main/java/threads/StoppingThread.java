package threads;

public class StoppingThread implements Runnable{
    private boolean isActive;
    void disable(){
        isActive = false;
    }

    StoppingThread(){
        isActive = true;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" начало");
        int counter = 1;
        while(isActive){
            System.out.println("поток "+counter++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }        }
        System.out.println(Thread.currentThread().getName()+" конец");
    }
}

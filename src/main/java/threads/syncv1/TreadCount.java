package threads.syncv1;

public class TreadCount implements Runnable{

    Treasure treasure;
    TreadCount(Treasure treasure){
        this.treasure = treasure;
    }

    @Override
    public void run() {
        synchronized (treasure){
            treasure.x=1;
            for (int i = 1; i<5; i++){
                System.out.println(Thread.currentThread().getName() + treasure.x);
                treasure.x++;
                try {
                    Thread.sleep(100);
                } catch ( InterruptedException e){
                    throw new RuntimeException(e);
                }
        }


        }
    }
}

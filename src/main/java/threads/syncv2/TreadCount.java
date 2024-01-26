package threads.syncv2;

import threads.syncv2.Treasure;

public class TreadCount implements Runnable{

    Treasure treasure;
    TreadCount(Treasure treasure){
        this.treasure = treasure;
    }

    @Override
    public void run() {
        synchronized (treasure){
            treasure.addTovar();




        }
    }
}

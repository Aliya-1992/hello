package threads.syncv2;

public class Treasure {
    int x;

    synchronized void addTovar(){
        x =1;
        for (int i =1; i<5; i++){
            System.out.println(Thread.currentThread().getName()+ " "+x);
            x++;
            try{Thread.sleep(666);}
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}


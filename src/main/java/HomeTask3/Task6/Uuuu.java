package HomeTask3.Task6;

public class Uuuu implements Runnable{

    private Integer num;
    public Uuuu(int num){
        this.num = num;
    }

    @Override
    public void run() {
        for(int r = num; r>-1; r=r-10){
            System.out.println(r);
        }
    }
}


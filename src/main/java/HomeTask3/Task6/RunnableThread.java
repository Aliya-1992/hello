package HomeTask3.Task6;


public class RunnableThread implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()); //с помощьб данной конструкции мы понимаем какой поток выполняется
            try{
                Thread.sleep(300);
            } catch (InterruptedException e){
                throw new RuntimeException();
            }


        }
    }


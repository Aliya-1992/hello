package threads;

import threads.syncv1.TreadCount;
import threads.syncv1.Treasure;

public class Program {
    public static void main(String[] args) {
        /*Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread2.setName("New Thread"); //придаем потоку значение
        System.out.println(thread1.getName()); //вызываем значение потока
        System.out.println(thread2.getName());
        System.out.println(thread2);
        thread1.setName("New Thread");
        thread1.setPriority(8);  //присваивается приоритет
        System.out.println(thread1);
        thread1.start(); //запускает поток
        thread1.run(); //определяет точку входа потока
        thread1.isAlive(); //проверяет, в каком сотсоянии поток
        thread1.isInterrupted(); //метод говорит о том что поток был прерван
        System.out.println("1");
        for (int i = 1; i<10; i++){
            new OwnThread("First thresd: " + i).start();
        }

        System.out.println("2");

        System.out.println("начал");
        OwnThread ownThread = new OwnThread("jj");
        ownThread.start();
        try {
            ownThread.join(); //данный метод заставляет ожидать вызываемый поток завершения работы текущего потока
        }  catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("закончил");
        System.out.println("начал");
        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();
        System.out.println("закончил");


        System.out.println("начало");
        StoppingThread stoppingThread = new StoppingThread();
        new Thread(stoppingThread, "StoppingTrhead").start();
        System.out.println("конец");
        try {
            Thread.sleep(1000);
            stoppingThread.disable();
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("начал");
        InterruptThread interruptThread = new InterruptThread("Inter");
        try {InterruptThread.sleep(400);
            interruptThread.interrupt();
            Thread.sleep(700);
        } catch (InterruptedException e)
        {throw new RuntimeException(e);
        }
        System.out.println("конец");

        Treasure treasure = new Treasure();
        for (int i =1; i<4; i++){
            Thread thread = new Thread(new TreadCount(treasure));
            thread.setName("car " + i);
            thread.start();
        }

    }*/
    }
}
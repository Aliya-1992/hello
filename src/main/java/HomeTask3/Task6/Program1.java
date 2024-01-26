package HomeTask3.Task6;

public class Program1 {
    public static void main(String[] args) {
        Thread runnablethread = new Thread(new RunnableThread());
        Thread runnablethread1 = new Thread(new RunnableThread());
        Thread runnablethread2 = new Thread(new RunnableThread());
        Uuuu uuuu = new Uuuu(100);
        Thread thread1 = new Thread(uuuu);
        thread1.start();
        runnablethread.start();
        Thread thread2 = new Thread(uuuu);
        thread2.start();
        runnablethread1.start();
        Thread thread3 = new Thread(uuuu);
        thread3.start();
        runnablethread2.start();


    }
}

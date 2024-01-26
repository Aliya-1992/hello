package HomeTask3.Task7;

public class Program {
    public static void main(String[] args) {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        TttThread tttThread = new TttThread(stringBuilder.toString());
        tttThread.start();
        TttThread tttThread1 = new TttThread(stringBuilder.toString());
        tttThread1.start();
        TttThread tttThread2 = new TttThread(stringBuilder.toString());
        tttThread2.start();

    }
}

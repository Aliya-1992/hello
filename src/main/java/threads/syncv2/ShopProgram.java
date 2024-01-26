package threads.syncv2;

public class ShopProgram {
    public static void main(String[] args) {
        Treasure treasure = new Treasure();
        for (int i = 1; i<4; i++)
        {Thread thread = new Thread(new TreadCount(treasure));
            thread.setName("car "+i);
            thread.start();
        }

    }
}

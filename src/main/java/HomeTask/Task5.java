package HomeTask;
import java.util.Arrays;
import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {



    Scanner scc = new Scanner(System.in);

    int num = scc.nextInt();
    System.out.println(massive(num));
}

    public static int massive(int num) {
        int i = -1;
        int[] nums1 = new int[num];
        int y = 0;
        while (i != num - 1) {
            Scanner sc = new Scanner(System.in);
            int num2 = sc.nextInt();
            i++;
            nums1[i] = num2;
            if (i%2==1){
                y = y+num2;
            }

        }
        return y;


    }


}
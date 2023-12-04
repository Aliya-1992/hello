package HomeTask;
import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num3(num));

    }

    public static int num3(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;


        }

        return sum;
    }
}

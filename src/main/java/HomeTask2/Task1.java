package HomeTask2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] nums1 = new int[10];
        int num3 = 9;
        for (int y = 0; y<=num3; y++){
            Random num4 = new Random();
            int num5 = num4.nextInt(num1, num2);
            nums1[y] = num5;
        }

        System.out.println(Arrays.toString(nums1));

    }
}

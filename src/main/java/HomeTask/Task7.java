package HomeTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doTask7(5)));
    }

    public static int[] doTask7(int numbers_length) {
        int[] numbers = new int[numbers_length];
        for (int i = 0; i < numbers_length; i++) {
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        int[] minAndMax = {min, max};
        return minAndMax;
    }
}

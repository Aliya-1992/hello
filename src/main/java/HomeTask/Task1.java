package HomeTask;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        for (int i=1; i<num+1; i++){
            res +=i;

        }
        System.out.println(res);

    }
}


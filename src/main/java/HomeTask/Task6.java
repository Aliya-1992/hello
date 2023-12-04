package HomeTask;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num/100000;
        int num2 = num/10000%10;
        int num3 = num/1000%10;
        int num4 = num/100%10;
        int num5 = num/10%10;
        int num6 = num%10;
        if (num1+num2+num3==num4+num5+num6){
            System.out.println("Билет счастливый");
        }
        else{
            System.out.println("Билет не счастливый");
        }
    }
}

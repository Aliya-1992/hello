package HomeTask3.Task4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, укажите основание логорифма: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Пожалуйста, укажите аргумент логорифма: ");
        int num2 = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#");
        Logo logo1 = new Logo(num1, num2);
        System.out.println(df.format(logo1.logo()));
        Logo logo2 = new Logo(4, 16);
        System.out.println(df.format(logo2.logo()));
        double num3 = Math.pow(3, -1);
        Logo logo3 = new Logo(3, num3);
        System.out.println(df.format(logo3.logo()));
        Logo logo4 = new Logo(Math.sqrt(5), 1);
        System.out.println(df.format(logo4.logo()));
        Logo logo5 = new Logo(Math.sqrt(7), Math.sqrt(7));
        System.out.println(df.format(logo5.logo()));
        Logo logo6 = new Logo(3, Math.sqrt(3));
        System.out.println(df.format(logo6.logo()));

    }

}

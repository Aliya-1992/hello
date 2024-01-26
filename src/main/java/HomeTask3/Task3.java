package HomeTask3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int h = 1;

        while (h<10){
            System.out.println("Пожалуйста, укажите первый катет: ");
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            System.out.println("Пожалуйста, укажите воторой катет: ");
            double num1 = sc.nextDouble();
            if (num1>0&&num>0){
                double num2 = Math.pow(num1, 2) + Math.pow(num, 2);
                double num3 = num2 - Math.pow(num1, 2);
                double s = num1*Math.sqrt(num3);
                System.out.println(s);
                break;
            }
            else{
                System.out.println("Из данных значений невозможно создать прямоугольный треугольник");}

        }

    }
}

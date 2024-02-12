package HomeTask3;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args) {


        int h = 1;

        while (h<10){
            System.out.println("Пожалуйста, укажите катет: ");
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            System.out.println("Пожалуйста, укажите гипотенузу: ");
            double num1 = sc.nextDouble();
            if (num1>num&&num1>0&&num>0){
                double num2 = Math.pow(num1, 2) - Math.pow(num, 2);
                System.out.println(num2);
                System.out.println(Math.sqrt(num2));
                double sinus = Math.sin(90);
                double s = 0.5*num*Math.sqrt(num2)*sinus;
                DecimalFormat df = new DecimalFormat("#.#");
                System.out.println(df.format(s));
                break;
            }
            else{
            System.out.println("Из данных значений невозможно создать прямоугольный треугольник");}

        }






    }
}

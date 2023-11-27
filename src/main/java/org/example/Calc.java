package org.example;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        String escape = "ESC";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Это калулькулятор. Для начала работы нажмите на любую клавишу. Для выхода наберите ESC");
        String stroka = scanner.nextLine();
        while (!stroka.equals(escape)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Хотите начать работать?");
            String strok = sc.nextLine();
            stroka = strok;
            System.out.println("ВВедите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();


            //double sum = num1 + num2;
            //double sub = num1 - num2;
            //double mult = num1 * num2;
            //double div = num1 + num2;
            System.out.println("Возможные действия: 1 - сложение, 2 - вычитание, 3-деление, 4 - умножение. Выберите действие: ");
            int action = scanner.nextInt();
            if (action > 4 && action > 1) {
                System.out.println("Вы указали неверное значение");
            } else {
                switch (action) {

                    case 1:
                        double sum = num1 + num2;
                        System.out.println(sum);
                        break;
                    case 2:
                        double sub = num1 - num2;
                        System.out.println(sub);
                        break;
                    case 3:
                        double div = num1 / num2;
                        System.out.println(div);
                        break;
                    case 4:
                        double mult = num1 * num2;
                        System.out.println(mult);
                        break;
                }

            }
        }
    }
}
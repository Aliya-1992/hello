package org.example;


import java.util.Scanner;


public class SimpleCalculator {
    public static void main(String[] args) throws Exception{
        String escape = "ESC";
        boolean flag = true;

       do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите начать работать?");
            String stroka = scanner.nextLine();
              if(stroka.equals(escape)){  // вот что было изменено
                System.out.println("Спасибо за иcпользование");
                break;
            }
            else if (flag == true){
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

                if (action > 4 && action > 1){
                    try {  //добвила здесь try
                        
                        throw new Exception();
                    }
                    catch (Exception e){
                        System.out.println("Вы указали некорректное значение");
                    }

                } else {
                    switch(action) {
                        case 1:
                            System.out.println(sum(num1, num2));
                            break;
                        case 2:
                            System.out.println(sub(num1, num2));
                            break;
                        case 3:
                            System.out.println(div(num1, num2));
                            break;
                        case 4:
                            System.out.println(mult(num1, num2));
                            break;
                    }
                }

            }
            else {
                System.out.println("Спасибо за иcпользование");
            }

        }  while(flag == true);

    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }
    public static double sub(double num1, double num2){
        return num1 - num2;

    }
    public static double div(double num1, double num2){
        return num1/num2;
    }
    public static double mult (double num1, double num2){
        return num1 * num2;
    }
}

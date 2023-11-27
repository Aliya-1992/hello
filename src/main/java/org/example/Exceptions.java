package org.example;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        /*try {
            int[] nums = new int[3];
           // nums[4] = 12;
            nums[2] = Integer.parseInt("123ззз");

        }
        catch (NumberFormatException e) {
            System.out.println(89);
        }

        finally {
            System.out.println("privet");
        }
        int num1 = 12;
        int num2 = 21;
        System.out.println(num1 + num2);
        }*/


        System.out.println("укажите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        try {
            if (num1 < 18) {
                throw new Exception("Ваш возраст не соответствует");
            }
            System.out.println("welcome");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
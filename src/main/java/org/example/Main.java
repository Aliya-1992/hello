package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        //System.out.println(name);
        //System.out.println(age);
        System.out.println("Ваше имя: " + name + " ваш возраст " + age);

    }
}
package org.example;

public class SameNames {
    public static void main(String[] args) {
        System.out.println(sum2(5, 57));
        System.out.println(sum2(2.3, 78.99));
        System.out.println(sum2(2, 6, 78));

    }
    public static int sum2(int num1, int num2){
        return num1 + num2;
    }
    public static double sum2(double num1, double num2){
        return num1 + num2;
    }
    public static int sum2( int num1, int num2, int num3){
        return num1 + num2+ num3;
    }
}

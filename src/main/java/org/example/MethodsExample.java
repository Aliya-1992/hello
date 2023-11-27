package org.example;

public class MethodsExample {
    public static void main(String[] args) {
        hello();
        goodbye();
        sum(3, 5);
        register("Dima", 77);
        helloNewSum(1, "uu", 1,5);
        System.out.println(mult(5, 9));

    }
    static void hello(){
        System.out.println("Y");
    }
    static void goodbye(){
        System.out.println("Goodbye");
    }

    static void sum(int num1, int num2){
        int result = num1+ num2;
        System.out.println(result);

    }
    static void register(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    static void helloNewSum (int newNum, String hello, int ...nums){
        int result = 0;
        for (int num: nums){
            result = result + num;
        }
        System.out.println(result);
        System.out.println(hello);
        System.out.println(newNum);
    }

    static int mult(int num1, int num2){
        System.out.println(num1*num2);
        return (num1*num2);

    }
}

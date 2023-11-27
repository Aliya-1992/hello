package org.example;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonachi(13));

    }
    public static int factorial (int num){
        int result = 1;
        for (int i = 1; i <=num; i++){
            result = result * i;
        }
            return result;
    }

    public static int fibonachi(int num){
        if (num == 1){
            return 1;
        }
        if (num == 0){
            return 0;
        }
        else{
            return (fibonachi(num-2)+fibonachi(num-1));
        }
    }




}

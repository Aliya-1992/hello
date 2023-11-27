package org.example;

public class MethodsEx {
    public static void main(String[] args) {

        int numOfRes = sum(12, 21);
        System.out.println(numOfRes);
        daytime(12);
        System.out.println(daytime(123));

    }

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        //System.out.println(result);
        return result;
    }

    static String daytime(int num) {
        if (num > 24 || num < 0) {
            return "Неправильное время";

        } else if (num < 0 && num < 10) {
            return "Доброе утро";

        } else if (num > 10 && num < 15) {
            return "Добрый день";

        } else {
            return "Добрый вечер";

        }
    }
}

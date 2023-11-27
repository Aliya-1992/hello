package org.example;

public class Conditions {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 15;

        //if (num2 == num1){
        //System.out.println(1);
        //} else if(num1 > num2){
        //System.out.println(3);
        // } else {
        //  System.out.println(2);
        //}
        int num3 = 19;
        switch (num3) {
            case 10:
                System.out.println(4);
                break;
            case 19:
                System.out.println(5);
                break;
            default:
                System.out.println(7);
        }
    }
}


package HomeTask2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите стоимость товара: ");
        double sum = sc.nextDouble();
        System.out.println("Укажите размер скидки в процентах: ");
        double skidka = sc.nextDouble();
        double finalSum = sum * skidka / 100;
        System.out.println("Окончательная стоимость: "+finalSum);

    }

}

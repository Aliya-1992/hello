package oop15;

public class Program {
    public static void main(String[] args) {
        PrintC printerClass = new PrintC();
        String[] animals = {"Cat", "Dog", "Horse", "monkey", "elephant"};
        Integer[] numbers = {23, 6, 5, 4, 89};
        Double[] nums = {1.1, 6.78, 8.9, 9.9, 8.7};
        printerClass.print(animals);
        System.out.println();
        printerClass.print(numbers);
        System.out.println();

    }
}

package oop11;

public class Program {
    public static void main(String[] args) {
        Operation operation = Operation.SUM;
        System.out.println(operation.action(1, 2));
        Operation operation1 = Operation.MULT;
        System.out.println(operation1.action(1, 2));
    }
}

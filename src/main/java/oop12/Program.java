package oop12;

public class Program {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey");
        System.out.println(sergey.toString());
        Person yan = new Person("Yan");
        System.out.println(yan.hashCode());
        Person ulya = new Person("Yan");
        System.out.println(ulya.getClass());
        System.out.println(yan.equals(ulya));


    }
}
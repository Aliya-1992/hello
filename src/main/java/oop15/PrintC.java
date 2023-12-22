package oop15;

public class PrintC {
    public <T> void print(T[] items){
        for (T item: items) {
            System.out.println(item);
        }
    }
}

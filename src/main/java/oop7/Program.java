package oop7;

public class Program {
    public static void main(String[] args) {
        //Book book =new Book("Ice and fire", "J. Martin");
        //book.print();
        Printable printable = new Book("Ice and fire", "J. Martin");
        printable.print();
        printable = new Magazine("Russkaya pravda");
        printable.print();


    }
}

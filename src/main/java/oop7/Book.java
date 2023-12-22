package oop7;

public class Book implements Printable{
    String name;
    String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void print() {
        System.out.println("Книгу под названием "+name +" написал "+ author);

    }
}

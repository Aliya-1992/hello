package oop16;


public class Account <A>{
    private String id;
    private int sum;
    private A newSum;

    public <T> Account(T id, int sum, A newSum){
        this.id = id.toString();
        this.sum = sum;
        this.newSum = newSum;
    }

    public A getNewSum() {
        return newSum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public <T> void print(T[] items){
        for (T item: items) {
            System.out.println(item);
        }
}}


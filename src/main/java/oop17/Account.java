package oop17;

public class Account {
    private String id;
    private int sum;
    public Account(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public String getId() {
        return id;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

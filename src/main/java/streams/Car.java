package streams;

public class Car {
    private String name;
    private int price;

    public Car(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public  static int compare(Car car1, Car car2){
        if (car1.getPrice() >car2.getPrice()){
            return 1;
        }
        else {return -1;}

    }
}

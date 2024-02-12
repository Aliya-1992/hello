package streams;

public class Phone {
    private String name;
    private int price;
    private String developer;
    public Phone(String name, int price, String developer){
        this.name = name;
        this.price = price;
        this.developer = developer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}

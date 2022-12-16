package prac6;

public class Comp {
    String name;
    int price;

    public Comp(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

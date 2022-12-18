package prac06.task04;

public class Bread implements Priceable{
    private int price;
    public Bread(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}

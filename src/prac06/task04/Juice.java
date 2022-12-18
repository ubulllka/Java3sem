package prac06.task04;

public class Juice implements Priceable{
    private int price;
    public Juice(int price){
        this.price=price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}


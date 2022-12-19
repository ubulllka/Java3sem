package prac29;
public final class Drink implements Item{
    private int cost;
    private String name;
    private String description;

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return cost + " " + name + " " + description;
    }
}
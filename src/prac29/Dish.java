package prac29;
public final class Dish implements Item{
    private int cost;
    private String name;
    private String description;

    public Dish(int cost, String name, String description) {
        if (cost < 0 || name == "" || description == "")
            throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String toString() {
        return cost + " " + name + " " + description;
    }
}


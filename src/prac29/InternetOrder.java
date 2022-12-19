package prac29;
import java.util.ArrayList;

public class InternetOrder implements Order{
    private MyList list;

    public InternetOrder() {
        list = new MyList();
    }

    public InternetOrder(Item[] array) {
        list = new MyList();
        for(int i = 0 ; i < array.length; i++) {
            list.add(array[i]);
        }
    }

    public boolean addItem(Item item) {
        list.add(item);
        return true;
    }

    public boolean deleteItem(String name) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public int deleteAllItems(String name) {
        int count = 0;
        while (list.include(name)) {
            deleteItem(name);
            count++;
        }
        return count;
    }

    public int getCount() {
        return list.size();
    }

    public void display() {
        list.display();
    }

    public Item[] getItems() {
        Item[] items = new Item[list.size()];
        for(int i = 0; i < list.size(); i++)
            items[i] = list.get(i);
        return items;
    }

    public int getCost() {
        int cost = 0;
        for(int i = 0; i < list.size(); i++) {
            cost += list.get(i).getCost();
        }
        return cost;
    }

    public int getCountOf(String name) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name))
                count++;
        }
        return count;
    }

    public String[] getNames() {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(!names.contains(list.get(i).getName()))
                names.add(list.get(i).getName());
        }
        String[] arr = new String[names.size()];
        arr = names.toArray(arr);
        return arr;
    }

    public Item[] sort() {
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            items.add(list.get(i));
        }
        items.sort(new CompareByCost());
        Item[] arr = new Item[items.size()];
        arr = items.toArray(arr);
        return arr;
    }
}

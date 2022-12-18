package prac06.task13;

import java.util.ArrayList;

public class StringBuilder2 {
    ArrayList<Observer> observers = new ArrayList<Observer>(0);
    StringBuilder str;

    public StringBuilder2(String str) {
        this.str = new StringBuilder(str);
    }

    public void notifyObservers()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(str);
        }
    }

    public void setObserver(Observer observer)
    {
        observers.add(observer);
        observer.update(str);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observers.indexOf(observer));
    }

    public void insert(String st, int index)
    {
        str.insert(index, st);
        notifyObservers();
    }

    public void append(String str)
    {
        this.str.append(str);
        notifyObservers();
    }

    public void delete(int start, int end)
    {
        str.delete(start, end);
        notifyObservers();
    }

    public void reverse()
    {
        str.reverse();
        notifyObservers();
    }

    public void replace(int start, int end, String str)
    {
        this.str.replace(start, end, str);
        notifyObservers();
    }
}
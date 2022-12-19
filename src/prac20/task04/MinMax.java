package prac20.task04;

public class MinMax<T extends Comparable>{
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T findMin(){
        if (arr.length == 0) return null;
        T min = arr[0];
        for(int i = 1; i < arr.length; i++)
            min = (arr[i].compareTo(min) < 0 )? arr[i] : min;
        return min;
    }

    public T findMax(){
        if (arr.length == 0) return null;
        T max = arr[0];
        for(int i = 1; i < arr.length; i++)
            max = (arr[i].compareTo(max) > 0 )? arr[i] : max;
        return max;
    }
}
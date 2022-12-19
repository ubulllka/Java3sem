package prac23.task01;

public class ArrayQueue {
    private int curentSize = 0;
    private int realSize = 8;
    private Object array[];

    public ArrayQueue(){
        array = new Object[realSize];
        curentSize = 0;
    }


    private void increaseRealSize( int newSize){
        if ( newSize < array.length) return;
        realSize = newSize;
        Object[] tmp = new Object[realSize];

        System.arraycopy(array, 0, tmp, 0, curentSize);

        array = tmp;

    }

    public void enqueue(Object newElement){
        if ( newElement == null) return;
        if (curentSize + 1 >= realSize*0.75) increaseRealSize(realSize*2);

        array[curentSize++] = newElement;
    }

    public Object element() {
        if(isEmpty()) return null;
        return array[0];
    }

    public Object dequeue() {
        if (isEmpty()) return null;
        Object[] tmp = new Object[realSize];
        Object firstElement = array[0];
        System.arraycopy(array, 0, tmp, 0, curentSize);
        curentSize--;
        array = tmp;
        return firstElement;
    }

    public int size() {
        return curentSize;
    }

    public boolean isEmpty() {
        return (curentSize == 0);
    }

    public void clear() {
        curentSize = 0;
        realSize = 8;
        array = new Object[realSize];
    }

    public String show() {
        String result = "Queue: ";
        for (int i = 0; i < curentSize; i++) result += array[i] + " ";
        return result;
    }
}

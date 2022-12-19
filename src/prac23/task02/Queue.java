package prac23.task02;

public interface Queue {
    void enqueue(Object element);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();

    String show();
}

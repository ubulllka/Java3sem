package prac21.task02;

public class NewArray<E> {
    private E[] array;

    public E get(int index){
        return array[index];
    }

    public void setArray(E[] array){
        this.array = array;
    }

}

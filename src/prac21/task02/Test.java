package prac21.task02;

public class Test {
    public static void main(String[] args) {
        NewArray<Integer> arr = new NewArray<>();
        Integer[] ar = {1,2,3,4,5};
        arr.setArray(ar);
        System.out.println(arr.get(3));
        NewArray<Boolean> arr2 = new NewArray<>();
        Boolean[] ar2 = {true, false, true};
        arr2.setArray(ar2);
        System.out.println(arr2.get(1));
    }
}

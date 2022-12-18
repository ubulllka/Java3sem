package prac11.task05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testAL = new ArrayList<>();
        LinkedList<Integer> testLL = new LinkedList<>();
        long time  = System.nanoTime();

        testAL.add(1);
        time = System.nanoTime() - time;
        System.out.print("arraylist add: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.add(1);
        time = System.nanoTime() - time;
        System.out.print("linkedlist add: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testAL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.print("arraylist insert: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.print("linkedlist insert: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testAL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("arraylist remove: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("linkedlist remove: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testAL.get(0);
        time = System.nanoTime() - time;
        System.out.print("arraylist find: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        testLL.get(0);
        time = System.nanoTime() - time;
        System.out.print("linkedlist find: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

    }
}
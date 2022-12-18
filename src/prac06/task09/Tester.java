package prac06.task09;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input len of array: ");
        int len = console.nextInt();
        Printable[] array = new Printable[len];
        for (int i = 0; i < len; i++)

            array[i] = new Book("Book"+(i+1));
        for (int i = 0; i < len; i++)
            array[i].print();
    }
}

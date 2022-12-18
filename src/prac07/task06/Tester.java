package prac07.task06;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input len of array: ");
        int len = console.nextInt();
        Printable[] array = new Printable[len];
        for (int i = 0; i < len; i++)
            if (i%2==0)
                array[i] = new Book("Book "+((int)(i/2) +1));
            else
                array[i] = new Magazine("Magazine " + ((int)(i/2)+1));
        for (int i = 0; i < len; i++)
            array[i].print();
        System.out.println("Book: ");
        Book.printBook(array);
        System.out.println("Magazine: ");
        Magazine.printMagazine(array);
    }
}


package prac14.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        String stForSplit = console.nextLine();
        System.out.println("Результат: ");
        String[] splitString = stForSplit.split("\\s+");
        for(String word : splitString)
            System.out.println(word);
    }
}

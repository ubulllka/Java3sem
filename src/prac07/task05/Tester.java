package prac07.task05;
import  java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = console.nextLine();
        ClassStrings classStrings = new ClassStrings(str);
        classStrings._lenght();
        classStrings.odd_string();
        classStrings.reverse();
    }
}

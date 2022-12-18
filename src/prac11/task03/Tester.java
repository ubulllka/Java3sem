package prac11.task03;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Input number of students: ");
        Scanner console = new Scanner(System.in);
        Student[] idNumber = new Student[console.nextInt()];
        for (int i = 0; i < idNumber.length; i++) {
            idNumber[i] = new Student();
            System.out.println(idNumber[i].getDate(i%3));
        }
    }
}

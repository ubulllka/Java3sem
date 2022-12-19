package prac18.task03;

import java.util.Scanner;

public class task_3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        task_3 test = new task_3();
        test.exceptionDemo();
    }
}

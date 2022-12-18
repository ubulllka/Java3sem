package prac07.task04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input double a: ");
        double a = console.nextDouble();
        System.out.print("Input double b: ");
        double b = console.nextDouble();
        System.out.print("Input double radius: ");
        double radius = console.nextDouble();
        MathFunc mathFunc = new MathFunc(a,b,radius);
        mathFunc.exponentiation();
        mathFunc.module();
        mathFunc.length();

    }
}

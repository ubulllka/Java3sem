package prac06.task11;

import java.util.Scanner;

public class Tester implements Convertable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float degrees = 0;
        System.out.print("Celsius: ");

        degrees = console.nextFloat();
        convert(degrees);
    }
    public static void convert(float celsius) {
        float Fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: " + Fahrenheit );
        float Kelvin = (celsius + 273.15f);
        System.out.println("Kelvin: " + Kelvin );
    }
}


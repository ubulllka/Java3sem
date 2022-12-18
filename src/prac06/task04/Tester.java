package prac06.task04;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input price of bread: ");
        int priceBread = console.nextInt();
        System.out.print("Input name of juice: ");
        int priceJuice = console.nextInt();
        Bread bread = new Bread(priceBread);
        Juice juice = new Juice(priceJuice);
        System.out.println("Bread: "+bread.getPrice());
        System.out.println("Juice: "+juice.getPrice());
    }
}



package prac08.task13;

import java.util.Scanner;
public class Main {

    public static void recursion(int cnt){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n>0){
            if (cnt%2==1)
                System.out.println(n);
            recursion(cnt+1);
        }
    }
    public static void main(String[] args) {

        recursion(1);
    }
}

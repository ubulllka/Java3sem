package prac08.task14;

import java.util.Scanner;
public class Main {

    public static void recursion(int n){
        if (n==0){
            return;
        }
        else{
            recursion((int) n/10);
            System.out.print(n%10+" ");
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        recursion(n);
    }
}
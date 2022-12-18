package prac08.task10;
import java.util.Scanner;

public class Main {
    public static int recursion(int n, int newN){
        if (n==0){
            return newN;
        }
        else{
            return recursion((int)n/10, 10*newN+n%10);
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int newN = recursion(n,0);
        System.out.print(newN);
    }
}

package prac08.task12;
import java.util.Scanner;

public class Main {

    public static void recursion(){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n>0){
            if (n%2==1)
                System.out.println(n);
            recursion();
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
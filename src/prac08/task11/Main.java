package prac08.task11;

import java.util.Scanner;

public class Main {

    public static int recursion(int cnt){
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        if (n.equals("00")){
            return cnt;
        }
        else{
            if (n.equals("1"))
                return recursion(cnt+1);
            else
                return recursion(cnt);
        }
    }
    public static void main(String[] args) {
        int newN = recursion(0);
        System.out.print(newN);
    }
}
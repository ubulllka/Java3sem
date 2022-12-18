package prac01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
public class Main5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int n = console.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for (int i=0; i<n; i++)
            array.add(random.nextInt(100));
        System.out.println(array+" n = "+array.size());
        System.out.println("Введите число, которое хотите удалить: ");
        int delet = console.nextInt();
        for (int i=array.size()-1; i>=0; i--){
            if (array.get(i) == delet) array.remove(i);
        }
        System.out.print(array+" n = "+array.size());
        System.out.println("\nВведите последнюю цифру: ");
        delet = console.nextInt();
        for (int i=array.size()-1; i>=0; i--){
            if ((array.get(i))%10 == delet) array.remove(i);
        }
        System.out.print(array+" n = "+array.size());
    }

}


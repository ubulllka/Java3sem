package prac11.task04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd\nHH mm ");
        Calendar cal = Calendar.getInstance();
        System.out.print("Input year: ");
        int year = console.nextInt();
        System.out.print("Input month (0 - 11): ");
        int month = console.nextInt();
        System.out.print("Input day: ");
        int day = console.nextInt();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DAY_OF_MONTH,day);

        System.out.println(sdf.format(cal.getTime()));
    }
}

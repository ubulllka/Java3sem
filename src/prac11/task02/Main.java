package prac11.task02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
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

        Date now = new Date();
        System.out.println("Input date: " + sdf.format(cal.getTime()));
        System.out.println("Now date: " + sdf.format(now));

        if (cal.getTime().after(now)){
            System.out.println("Input date is later now date ");
        } else if (cal.getTime().before(now)){
            System.out.println("Input date is earlier now date ");
        } else {
            System.out.println("Input date is same now date ");
        }
    }
}

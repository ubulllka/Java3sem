package prac11.task01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name"));
        System.out.println("Булгакова");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,1);
        cal.set(Calendar.HOUR_OF_DAY,16);
        cal.set(Calendar.MINUTE,20);
        cal.set(Calendar.SECOND,00);
        System.out.println("Task received: " + sdf.format(cal.getTime()));
        Date now = new Date();
        System.out.println("Task is completed: " + sdf.format(now));
    }
}

package prac14.task07;

public class Main {
    public static void main(String[] args) {
        String str1 = "F032_Password";
        String str2 = "smart_pass";
        System.out.println(str1 +" - это строка"+((str1.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}"))? " " : " не ") +"соответствует условию");
        System.out.println(str2 +" - это строка"+((str2.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}"))? " " : " не ") +"соответствует условию");
    }
}

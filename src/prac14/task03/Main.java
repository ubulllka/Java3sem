package prac14.task03;

public class Main {
    public static void main(String[] args) {
        String str1 = "25.98 USD";
        String str2 = "44 ERR";
        System.out.println(str1 +" - это строка"+((str1.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)"))? " " : " не ") +"соответствует условию");
        System.out.println(str2 +" - это строка"+((str2.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)"))? " " : " не ") +"соответствует условию");
    }
}

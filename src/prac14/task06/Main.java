package prac14.task06;

public class Main {
    public static void main(String[] args) {
        String str1 = "user@example.com";
        String str2 = "myhost@@@com.ru";
        System.out.println(str1 +" - это строка"+((str1.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$"))? " " : " не ") +"соответствует условию");
        System.out.println(str2 +" - это строка"+((str2.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$"))? " " : " не ") +"соответствует условию");
    }
}

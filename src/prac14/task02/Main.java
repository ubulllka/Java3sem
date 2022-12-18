package prac14.task02;

public class Main {
    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str1 +" - это строка"+((str1.matches("abcdefghijklmnopqrstuv18340"))? " " : " не ") +"соответствует \"abcdefghijklmnopqrstuv18340\"");
        System.out.println(str2 +" - это строка"+((str2.matches("abcdefghijklmnopqrstuv18340"))? " " : " не ") +"соответствует \"abcdefghijklmnopqrstuv18340\"");
    }
}

package prac14.task04;

public class Main {
    public static void main(String[] args) {
        String str1 = "(1+8)-9/4";
        String str2 = "6/5-2*9";
        System.out.println(str1 +" - это строка"+((str1.matches(".*(\\+)\\s*[0-9]{1,}.*"))? " " : " не ") +"соответствует условию");
        System.out.println(str2 +" - это строка"+((str2.matches(".*(\\+)\\s*[0-9]{1,}.*"))? " " : " не ") +"соответствует условию");
    }
}

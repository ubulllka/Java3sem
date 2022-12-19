package prac25.task04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str1 = "((3*+*5)*–*9*×*4)";
        String str2 = "((3*+*5)*–*9*×*4";
        isString(str1);
        isString(str2);
    }

    public static boolean find(String str) {
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher;
        while ((matcher = pattern.matcher(str)).find())
            str = matcher.replaceAll("");
        return !(str.contains("(") || str.contains((")")));
    }

    public static void isString(String str) {
        System.out.println(str +" - это строка"+((find(str))? " " : " не ") +"соответствует условию");
    }
}

package prac13.task01;

public class Main {
    public static void getS(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s1="I like Java!!!";
        String s2="He hates C++!!";
        getS(s1);
        System.out.println(s1+" charAt: "+s1.charAt(s1.length()-1));
        System.out.println(s2+" charAt: "+s2.charAt(s2.length()-1));
        System.out.println(s1+" end with \"!!!\" ? "+s1.endsWith("!!!"));
        System.out.println(s2+" end with \"!!!\" ? "+s2.endsWith("!!!"));
        System.out.println(s1+" start with \"I like\" ? "+s1.startsWith("I like"));
        System.out.println(s2+" start with \"I like\" ? "+s2.startsWith("I like"));
        System.out.println(s1+" contains \"Java\" ? "+s1.contains("Java"));
        System.out.println(s2+" contains \"Java\" ? "+s2.contains("Java"));
        System.out.println(s1+" index of \"Java\" ? "+s1.indexOf("Java"));
        System.out.println(s2+" index of \"Java\" ? "+s2.indexOf("Java"));
        System.out.println(s1+" replace a o \"Java\" ? "+s1.replace('a','o'));
        System.out.println(s1+" upper ? "+s1.toUpperCase());
        System.out.println(s1+" lower ? "+s1.toLowerCase());
        System.out.println(s1+" lower ? "+s1.toLowerCase());
        System.out.println(s1+" substr ? "+s1.substring(s1.indexOf("Java"),s1.indexOf("Java")+4) );

    }
}

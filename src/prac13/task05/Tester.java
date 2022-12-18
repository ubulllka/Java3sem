package prac13.task05;

public class Tester {
    public static void main(String[] args) {
        String s1 = "+79537424345";
        Telephone telephone = new Telephone(s1);
        System.out.println(telephone.toString());
        String s2 = "109537424345";
        telephone = new Telephone(s2);
        System.out.println(telephone.toString());
    }
}

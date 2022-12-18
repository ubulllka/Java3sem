package prac13.task03;

public class Tester {
    public static void main(String[] args) {
        String s1 = "Россия, Сахалинская_область, Видное, Космонавтов, 77, 4, 130";
        Address address = new Address(s1,false);
        System.out.println(address.toString());
        String s2 = "Россия, Сахалинская_область, Видное, Космонавтов, 77, 4, 130";
        Address address2 = new Address(s2,true);
        System.out.println(address2.toString());
        String s3 = "Россия, Архангельская_область, Лотошино, Гоголя, 18, 5, 16";
        Address address3 = new Address(s3,true);
        System.out.println(address3.toString());
        String s4 = "Россия, Архангельская_область, Лотошино, Гоголя, 18, 5, 16";
        Address address4 = new Address(s4,true);
        System.out.println(address4.toString());
    }
}

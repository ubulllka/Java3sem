package prac25.task03;

public class Test {
    public static void main(String[] args) {
        String str1 = "127.0.0.1";
        String str2 = "255.255.255.0";
        String str3 = "1300.6.7.8";
        String str4 = "abc.def.gha.bcd.";
        isIp(str1);
        isIp(str2);
        isIp(str3);
        isIp(str4);

    }

    public static void isIp(String str) {
        System.out.println(str +" - это строка"+((str.matches("^(((25[0-5])|(2[0-4][0-9])|([01][0-9]{2})|([0-9]{1,2}))\\.){3}((25[0-5])|(2[0-4][0-9])|([01][0-9]{2})|([0-9]{1,2}))$"))? " " : " не ") +"IP");

    }
}

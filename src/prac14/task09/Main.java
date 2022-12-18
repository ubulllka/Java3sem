package prac14.task09;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str="asjdhkasdgfreerkjscmnbas";
        Map<String, Integer> dictionary = new HashMap<>();
        for(int i = 97; i < 123; i++){
            Pattern pattern = Pattern.compile(Character.toString((char)i));
            Matcher matcher = pattern.matcher(str);
            int count = 0;
            while(matcher.find()) count++;
            dictionary.put(Character.toString((char)i), count);
        }

        System.out.println("Map: " + dictionary);
    }
}

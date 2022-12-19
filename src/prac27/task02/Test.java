package prac27.task02;

public class Test{


    public static void main(String[] args) {
        NewMap newMap = new NewMap();
        newMap.addValue("q","a");
        newMap.addValue("q","s");
        newMap.addValue("w","d");
        newMap.addValue("w","f");
        newMap.addValue("e","g");
        newMap.addValue("e","a");
        newMap.addValue("r","s");
        newMap.addValue("t","d");
        newMap.addValue("y","f");
        newMap.addValue("u","g");
        System.out.println(newMap.getSameFirstNameCount());
        System.out.println(newMap.getSameLastNameCount());

    }
}
package prac06.task12;

public class Test {
    public static void main(String... args)
    {
        StringBuilder2 str = new StringBuilder2("Cat");
        str.append("Meow");
        str.undo();
        System.out.println(str.toString());
    }
}

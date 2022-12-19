package prac20.task01;

public class Test {
    public static void main(String[] args) {
        GenClass<Integer,String,NewAnimal> genClass = new GenClass<>(10,"10", new NewAnimal("cat",5));
        genClass.showClassesName();
    }
}

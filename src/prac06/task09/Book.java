package prac06.task09;

public class Book implements Printable {
    private String name;
    public Book(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Book: "+ name);
    }
}


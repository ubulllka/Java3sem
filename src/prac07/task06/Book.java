package prac07.task06;

public class Book implements Printable {
    private String name;
    public Book(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Book: "+ name);
    }
    public static void printBook(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Book)
                printable[i].print();
        }
    }
}

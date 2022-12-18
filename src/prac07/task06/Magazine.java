package prac07.task06;

public class Magazine implements Printable {
    private String name;
    public Magazine(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Magazine: "+ name);
    }

    public static void printMagazine(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Magazine)
                printable[i].print();
        }
    }
}

package prac26;
public class Test {

    public static void main(String[] args){
        Hashtab tab = new Hashtab();
        tab.hashtabInit();
        tab.hashtabAdd(2,"q");
        tab.hashtabAdd(3,"w");
        tab.hashtabAdd(14,"e");
        tab.hashtabAdd(5,"r");
        tab.hashtabAdd(8,"t");
        tab.hashtabAdd(12,"y");
        tab.hashtabAdd(1,"u");
        tab.hashtabAdd(11,"i");
        tab.hashtabAdd(9,"o");
        tab.hashtabAdd(10,"p");
        tab.hashtabPrint();
        System.out.println(tab.hashtabLookUp(10));
        tab.hashtabDelete(1);
        tab.hashtabDelete(5);
        tab.hashtabDelete(10);
        tab.hashtabPrint();

    }

}

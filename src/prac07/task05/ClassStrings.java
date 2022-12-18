package prac07.task05;


public class ClassStrings implements Strings{

    String str;
    public ClassStrings(String str){
        this.str = str;
    }
    @Override
    public void _lenght() {
        System.out.println("Length = " + str.length());
    }

    @Override
    public void odd_string() {
        String newString ="";
        for (int i = 0; i < str.length(); i++) {
           if (i%2==1) {
               newString += str.charAt(i);
           }
        }
        System.out.println("Odd string: "+newString);
    }

    @Override
    public void reverse() {
        String newString = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse string: "+newString);
    }
}

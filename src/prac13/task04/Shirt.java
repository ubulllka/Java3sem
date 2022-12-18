package prac13.task04;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String str){
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i].strip();
        code = arr[0];
        name = arr[1];
        color = arr[2];
        size = arr[3];
    }

    @Override
    public String toString(){
        return "\ncode: "+code+"\nname:"+name+"\ncolor: "+color+"\nsize: "+size;
    }
}

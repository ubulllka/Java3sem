package prac14.task08;

import java.util.Arrays;

public class Main implements Filter{
    public static void main(String[] arg){
        Main main=new Main();
        String[] array = new String[]{"123","345","345","123","467"};
        String[] newArray = (String[])filter(array, main);
        System.out.println(Arrays.toString(newArray));
    }

    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;
        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }

    @Override
    public boolean apply(Object o) {
        return !o.equals("345");
    }
}

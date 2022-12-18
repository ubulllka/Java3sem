package prac13.task05;
public class Telephone {
    private String number;
    public Telephone(String number){
        this.number = number;
    }

    @Override
    public String toString(){
        int len = number.length();
        if (number.startsWith("+")){
            return "+"+number.substring(1,len-10)+" "+number.substring(len-10,len-7)+"-"+number.substring(len-7,len-4)+"-"+number.substring(len-4,len);
        }
        else{
            return "+"+number.substring(0,len-10)+" "+number.substring(len-10,len-7)+"-"+number.substring(len-7,len-4)+"-"+number.substring(len-4,len);
        }
    }

}

package prac19;
public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("Введена пустая строка");
    }

}
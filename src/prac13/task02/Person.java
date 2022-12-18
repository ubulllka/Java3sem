package prac13.task02;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName){
        this.lastName = lastName;
        this.firstName = "";
        this.patronymic = "";
    }

    public Person(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic="";
    }

    public Person(String lastName, String firstName, String patronymic){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String fullName(){
        if (firstName.equals("") && patronymic.equals(""))
            return lastName;
        if (patronymic.equals(""))
            return  lastName+" "+firstName;
        return lastName+" "+firstName+" "+patronymic;
    }

    public String shortName(){
        if (firstName.equals("") && patronymic.equals(""))
            return lastName;
        if (patronymic.equals(""))
            return  lastName+" "+firstName.charAt(0)+".";
        return  lastName+" "+firstName.charAt(0)+"."+patronymic.charAt(0)+".";
    }
}

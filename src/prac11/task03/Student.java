package prac11.task03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String specialization;
    private int course;
    private String group;
    private int id;
    private int gpy;


    private SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
    private SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM d, yyyy");
    private Calendar cal = Calendar.getInstance();

    public Student(){
        int n = (int)(Math.random()*900)+100;
        this.firstName = "FirstNameStudent"+n;
        this.lastName = "LastNameStudent"+n;
        this.specialization = "Spec"+n;
        this.course = n;
        this.group = "Group"+n;
        this.id = (int)(Math.random()*1000) + 1;
        this.gpy =(int)(Math.random()*1000) + 1;
        int year = 1970 + (int)(Math.random()*40);
        int month = (int)(Math.random()*12);
        int day = 1+(int)(Math.random()*28);
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DAY_OF_MONTH,day);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGpy() {
        return gpy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpy(int gpy) {
        this.gpy = gpy;
    }

    @Override
    public String toString(){
        return firstName+" "+lastName+" "+specialization+" "+course+"  "+group+"  "+id+" "+gpy;
    }

    public String getDate(int n){
        switch (n){
            case 0:
                return firstName+" "+lastName+" "+sdf1.format(cal.getTime());
            case 1:
                return firstName+" "+lastName+" "+sdf2.format(cal.getTime());
            case 2:
                return firstName+" "+lastName+" "+sdf3.format(cal.getTime());
            default:
                return "";
        }
    }
    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}


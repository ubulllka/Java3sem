package prac10;
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String specialization;
    private int course;
    private String group;
    private int id;
    private int gpy;
    public Student(){
        int n = (int)(Math.random()*900)+100;
        this.firstName = "FirstNameStudent"+n;
        this.lastName = "LastNameStudent"+n;
        this.specialization = "Spec"+n;
        this.course = n;
        this.group = "Group"+n;
        this.id = (int)(Math.random()*1000) + 1;
        this.gpy =(int)(Math.random()*1000) + 1;
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

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}

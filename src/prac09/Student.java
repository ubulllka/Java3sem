package prac09;
public class Student implements Comparable<Student> {
    public int id;
    public int gpy;
    public Student(int id, int gpy){
        this.id = id;
        this.gpy = gpy;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}

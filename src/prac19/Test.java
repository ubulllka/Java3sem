package prac19;
import java.util.ArrayList;

public class Test{
    public static void main(String[] args) {
        ArrayList<Student> alStudents = new ArrayList<>();
        alStudents.add(new Student("Дмитрий", "Баранов", "Экономист", 2, "ББ-22-21", 5));
        alStudents.add(new Student("Елена", "Воронова", "Маркетинг",3, "ЛЛ-33-20",4));

        new LabClassUI(alStudents);
    }
}
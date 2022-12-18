package prac09;
import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input number of students: ");
        int n1 = console.nextInt();
        Student[] idNumber1 = new Student[n1];
        for (int i = 0; i < idNumber1.length; i++)
            idNumber1[i] = new Student((int)(Math.random()*1000) +1,(int)(Math.random()*1000));
        for(Student student : idNumber1)
            System.out.println( student.id+" "+student.gpy);

        for (int i = 1; i < idNumber1.length; i++) {
            Student swap = idNumber1[i];
            int j = i;
            for (; j > 0 && swap.id < idNumber1[j - 1].id; j--)
                idNumber1[j] = idNumber1[j - 1];
            idNumber1[j] = swap;
        }

        System.out.println("Insertion sort array: ");
        for(Student student : idNumber1)
            System.out.println(student.id+" "+student.gpy);

        System.out.println("Quit sort array: ");
        quickSort(idNumber1, 0, idNumber1.length-1);
        for (Student s : idNumber1)
            System.out.println(s.id+ " "+ s.gpy);

        System.out.print("Input number of students: ");
        int n2 = console.nextInt();
        Student[] idNumber2 = new Student[n2];
        for (int i = 0; i < idNumber2.length; i++)
            idNumber2[i] = new Student((int)(Math.random()*1000) +1,(int)(Math.random()*1000));
        for(Student student : idNumber2)
            System.out.println( student.id+" "+student.gpy);
        System.out.println("Merge sort of students: ");
        Student[] allStudents = new Student[idNumber1.length + idNumber2.length];
        System.arraycopy(idNumber1, 0, allStudents,0,idNumber1.length);
        System.arraycopy(idNumber2, 0, allStudents,idNumber1.length, idNumber2.length);
        mergeSort(allStudents,0, allStudents.length-1);
        for(Student student : allStudents)
            System.out.println( student.id+" "+student.gpy);

    }


    private static SortingStudentsByGPA comp = new SortingStudentsByGPA();

    public static void quickSort( Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (comp.compare(source[leftMarker], pivot) < 0)
                leftMarker++;

            while (comp.compare(source[rightMarker], pivot) > 0)
                rightMarker--;

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }


    public static void mergeSort(Student[] arr, int start, int end) {
        if (end - start + 1 <= 1) return;
        mergeSort(arr, start, start + (end-start)/2);
        mergeSort(arr, start + (end-start)/2 + 1, end);
        var startIndex = start;
        var midIndex = start + (end - start) / 2 + 1;
        var result = new Student[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            if (startIndex < start + (end-start) / 2 + 1) {
                if (midIndex <= end) {
                    if (arr[startIndex].compareTo(arr[midIndex]) > 0) {
                        result[i] = arr[midIndex++];
                        continue;
                    }
                }
                result[i] = arr[startIndex++];
            } else {
                result[i] = arr[midIndex++];
            }
        }
        for (int i = 0; i < result.length; i++) {
            arr[start+i] = result[i];
        }
    }
}

package prac10;
import java.util.Comparator;
import java.util.Scanner;

public class Tester implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpy() - o2.getGpy();
    }
    static Student[] idNumber;
    private static Tester comp = new Tester();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        idNumber = setArray();

        outArray(idNumber);

        insertionSort(idNumber);

        System.out.println("Insertion sort array: ");
        outArray(idNumber);

        quickSort(idNumber, 0, idNumber.length-1);
        System.out.println("Quit sort array: ");
        outArray(idNumber);

        Student[] idNumber2 =setArray();
        System.out.println("Array 2: ");
        outArray(idNumber2);

        System.out.println("Merge sort of students: ");
        Student[] twoArray = combiningArrays(idNumber, idNumber2);

        mergeSort(twoArray,0, twoArray.length-1);
        outArray(twoArray);

    }

    public static Student[] setArray(){
        Scanner console = new Scanner(System.in);
        System.out.print("Input number of students: ");
        int n = console.nextInt();
        Student[] array = new Student[n];
        for (int i = 0; i < array.length; i++)
            array[i] = new Student();
        return array;
    }

    public static Student[] combiningArrays(Student[] array1, Student[] array2){
        Student [] newArray = new Student[array1.length + array2.length];
        System.arraycopy(array1, 0, newArray,0,array1.length);
        System.arraycopy(array2, 0, newArray,array1.length, array2.length);
        return newArray;
    }

    public static void outArray(Student[] array){
        for(Student student : array)
            System.out.println(student.toString());
    }

    public static void insertionSort(Student[] array){
        for (int i = 1; i < array.length; i++) {
            Student temp = array[i];
            int j = i;
            for (; j > 0 && temp.getId() < array[j - 1].getId(); j--)
                array[j] = array[j - 1];
            array[j] = temp;
        }
    }
    public static void quickSort( Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (comp.compare(source[leftMarker], pivot) > 0)
                leftMarker++;

            while (comp.compare(source[rightMarker], pivot) < 0)
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

package prac18.task01;

public class task_1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
        //System.out.println(2 / 0);
    }

    public static void main(String[] args) {
        task_1 test = new task_1();
        test.exceptionDemo();
    }
}





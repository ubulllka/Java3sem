package prac23.task01;
public class Test {
    public static void main(String[] args) {
        new ArrayQueueModule();
        fillModule(10);
        System.out.println(ArrayQueueModule.show());
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.show());
        System.out.println("----------------------------------");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        fillADT(queueADT,10);
        System.out.println(ArrayQueueADT.show(queueADT));
        System.out.println(ArrayQueueADT.element(queueADT));
        System.out.println(ArrayQueueADT.dequeue(queueADT));
        System.out.println(ArrayQueueADT.size(queueADT));
        System.out.println(ArrayQueueADT.isEmpty(queueADT));
        ArrayQueueADT.clear(queueADT);
        System.out.println(ArrayQueueADT.show(queueADT));
        System.out.println("----------------------------------");
        ArrayQueue queue = new ArrayQueue();
        fillQueue(queue,10);
        System.out.println(queue.show());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.show());
        System.out.println("----------------------------------");


    }
    public static void fillModule(int size){
        for(int i =0 ;i < size; i++) ArrayQueueModule.enqueue(i);
    }
    public static void fillADT(ArrayQueueADT queueADT,int size){
        for (int i = 10; i < size+10; i++) ArrayQueueADT.enqueue(queueADT, i);
    }
    public static void fillQueue(ArrayQueue queue, int size){
        for(int i = 20; i < size+20; i++) queue.enqueue(i);
    }


}

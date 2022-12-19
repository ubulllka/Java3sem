package prac20.task04;

public class Test {
    public static void main(String[] args) {
        MinMax<Double> minMax = new MinMax<>(new Double[]{5.0d, 2.0d, 3.5d, 4.0d, -1.0d});
        System.out.println(minMax.findMin());
        System.out.println(minMax.findMax());
        System.out.println(Calculator.sum(10.5d,2));
        System.out.println(Calculator.subtraction(10.5d,2));
        System.out.println(Calculator.multiply(10.5d,2));
        System.out.println(Calculator.divide(10.5d,2));
    }
}

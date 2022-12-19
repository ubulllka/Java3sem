package prac22;
public class CalculatorDriverTest {
    public static void main(String[] args) {
        System.out.println("Test 1: " + CalculatorDriver.calculate("25 1 2 ++ 4 /"));
        System.out.println("Test 2: " + CalculatorDriver.calculate("8 2 5 * + 6 4 - /"));
        System.out.println("Test 3: " + CalculatorDriver.calculate("1 2 ++"));
        System.out.println("Test 4: " + CalculatorDriver.calculate("2 7 3 - / 5 4 + *"));
        System.out.println("Test 5: " + CalculatorDriver.calculate("1 2 3+"));
        System.out.println("Test 6: " + CalculatorDriver.calculate("1"));
        System.out.println("Test 6: " + CalculatorDriver.calculate("-"));
    }
}
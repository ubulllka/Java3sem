package prac07.task04;

public class MathFunc implements MathCalculable{

    double a, b, radius;
    public MathFunc(double a, double b, double radius){
        this.a = a;
        this.b = b;
        this.radius = radius;
    }

    @Override
    public void exponentiation() {
        System.out.println("a**b = " + Math.pow(a,b));
    }

    @Override
    public void module() {
        System.out.println("(a*a+b*b)^0.5 = " + Math.sqrt(a*a+b*b));
    }

    public void length() {
        System.out.println("С = " + pi*radius);
    }
}

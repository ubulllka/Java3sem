package prac07.task01;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int x1,x2,y1,y2,xSpeed,ySpeed;
        Scanner console = new Scanner(System.in);
        System.out.println("Point 1:");
        System.out.print("Input x1: ");
        x1=console.nextInt();
        System.out.print("Input y1: ");
        y1=console.nextInt();
        System.out.println("Point 2:");
        System.out.print("Input x2: ");
        x2=console.nextInt();

        System.out.print("Input y2: ");
        y2=console.nextInt();

        System.out.print("Input xSpeed: ");
        xSpeed=console.nextInt();
        System.out.print("Input ySpeed: ");
        ySpeed=console.nextInt();

        MovableRectangle rectangle = new MovableRectangle(x1,y1,x2,y2,xSpeed,ySpeed);
        System.out.println(rectangle.toString());
        System.out.println("Move up: ");
        rectangle.moveUp();
        System.out.println(rectangle.toString());
        System.out.println("Move left: ");
        rectangle.moveLeft();
        System.out.println(rectangle.toString());
        System.out.println("Move down: ");
        rectangle.moveDown();
        System.out.println(rectangle.toString());
        System.out.println("Move right: ");
        rectangle.moveRight();
        System.out.println(rectangle.toString());
    }
}

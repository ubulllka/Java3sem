package prac06.task01;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int x,y,xSpeed,ySpeed,radius;
        Scanner console = new Scanner(System.in);
        System.out.println("Point:");
        System.out.print("Input x: ");
        x=console.nextInt();
        System.out.print("Input y: ");
        y=console.nextInt();
        System.out.print("Input xSpeed: ");
        xSpeed=console.nextInt();
        System.out.print("Input ySpeed: ");
        ySpeed=console.nextInt();
        MovablePoint point = new MovablePoint(x,y,xSpeed,ySpeed);
        System.out.println(point.toString());
        System.out.println("Move up: ");
        point.moveUp();
        System.out.println(point.toString());
        System.out.println("Move left: ");
        point.moveLeft();
        System.out.println(point.toString());
        System.out.println("Move down: ");
        point.moveDown();
        System.out.println(point.toString());
        System.out.println("Move right: ");
        point.moveRight();
        System.out.println(point.toString());
        System.out.println("=============================================");

        System.out.println("Circle:");
        System.out.print("Input x: ");
        x=console.nextInt();
        System.out.print("Input y: ");
        y=console.nextInt();
        System.out.print("Input xSpeed: ");
        xSpeed=console.nextInt();
        System.out.print("Input ySpeed: ");
        ySpeed=console.nextInt();
        System.out.print("Input radius: ");
        radius=console.nextInt();
        MovableCircle circle = new MovableCircle(x,y,xSpeed,ySpeed,radius);
        System.out.println(circle.toString());
        System.out.println("Move up: ");
        circle.moveUp();
        System.out.println(circle.toString());
        System.out.println("Move left: ");
        circle.moveLeft();
        System.out.println(circle.toString());
        System.out.println("Move down: ");
        circle.moveDown();
        System.out.println(circle.toString());
        System.out.println("Move right: ");
        circle.moveRight();
        System.out.println(circle.toString());
    }
}


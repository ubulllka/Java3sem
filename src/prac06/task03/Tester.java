package prac06.task03;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input name of animal: ");
        String nameAnimal = console.nextLine();
        System.out.print("Input name of planet: ");
        String namePlanet = console.nextLine();
        Animal animal = new Animal(nameAnimal);
        Planet planet = new Planet(namePlanet);
        System.out.println("Animal: "+animal.getName());
        System.out.println("Planet: "+planet.getName());
    }
}

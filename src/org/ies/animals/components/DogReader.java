package org.ies.animals.components;

import org.ies.animals.model.Dog;

import java.util.Scanner;

public class DogReader {
    private final Scanner scanner;

    public DogReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Dog read () {
        System.out.println("Ingrese la edad del perro:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la raza del perro:");
        String raza = scanner.nextLine();

        return new Dog(
               edad,
               raza
        );
    }
}

package org.ies.animals.components;

import org.ies.animals.model.Cat;

import java.util.Scanner;

public class CatReader {
    private final Scanner scanner;

    public CatReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cat read () {
        System.out.println("Ingrese la edad del gato:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el color del gato:");
        String color = scanner.nextLine();

        return new Cat(
                edad,
                color
        );
    }
}

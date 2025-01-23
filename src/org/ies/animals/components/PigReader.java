package org.ies.animals.components;

import org.ies.animals.model.Pig;

import java.util.Scanner;

public class PigReader {
    private final Scanner scanner;

    public PigReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Pig read () {
        System.out.println("Ingrese la edad del cerdo:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la alimentacion del cerdo:");
        String alimentacion = scanner.nextLine();

        return new Pig(
                edad,
                alimentacion
        );
    }
}

package org.ies.animals.components;

import org.ies.animals.model.Animal;

import java.util.Scanner;

public class AnimalReader {
        private final Scanner scanner;
        private final DogReader dogReader;
        private final CatReader catReader;
        private final PigReader pigReader;

    public AnimalReader(Scanner scanner, DogReader dogReader, CatReader catReader, PigReader pigReader) {
        this.scanner = scanner;
        this.dogReader = dogReader;
        this.catReader = catReader;
        this.pigReader = pigReader;
    }

    public Animal read() {
        int option = chooseOption();
        do{
            if(option == 1){
                return dogReader.read();
            }
            if(option == 2){
             return catReader.read();
            }
            if(option == 3){
             return pigReader.read();
            }
        }while (option != 4);

        return null;
    }

    public int chooseOption(){
        int option;

        System.out.println("Eliga una opcion del menu:");
        System.out.println("1.Informacion del perro:");
        System.out.println("2.Informacion del gato :");
        System.out.println("3. Informacion del cerdo:");

        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}

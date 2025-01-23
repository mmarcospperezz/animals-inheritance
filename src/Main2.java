import org.ies.animals.components.AnimalReader;
import org.ies.animals.components.CatReader;
import org.ies.animals.components.DogReader;
import org.ies.animals.components.PigReader;
import org.ies.animals.model.Animal;
import org.ies.animals.model.Cat;
import org.ies.animals.model.Dog;
import org.ies.animals.model.Pig;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogReader dogReader = new DogReader(scanner);
        CatReader catReader = new CatReader(scanner);
        PigReader pigReader = new PigReader(scanner);
        AnimalReader animalReader = new AnimalReader(scanner,dogReader,catReader,pigReader);

        Animal animal = animalReader.read();
        animal.showInfo();
    }
}



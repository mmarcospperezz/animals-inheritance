import org.ies.animals.model.Cat;
import org.ies.animals.model.Dog;
import org.ies.animals.model.Pig;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(5, "Labrador");
        Cat cat = new Cat(3, "Negro");
        Pig pig = new Pig(2, "bellotas");

        dog.talk();
        dog.showInfo();

        cat.talk();
        cat.showInfo();

        pig.talk();
        pig.showInfo();
    }
}



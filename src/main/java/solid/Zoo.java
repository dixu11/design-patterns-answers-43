package solid;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {



        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

}

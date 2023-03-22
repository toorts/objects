package veterinary;

import impl.Runnable;
import parent.Animal;
import impl.*;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public List<Swimmable> getSwimmingAnimals() {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Swimmable) swimmingAnimals.add((Swimmable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

}

package veterinary;

import parent.Animal;
import impl.*;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    private Human headPhysician;

    public VetClinic(Human headPhysician) {
        this.headPhysician = headPhysician;
        this.animals = new ArrayList<>();
    }
    public VetClinic() { this(null); }

    public List<Animal> getAllAnimals() { return this.animals; }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public List<Swimmable> getSwimmingAnimals() {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimmable) swimmingAnimals.add((Swimmable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public Human getHeadPhysician() {
        return headPhysician;
    }

    public VetClinic addAnimal(Animal animal) {
        if (animal instanceof Human)
            this.headPhysician = (Human) animal;
        else
            this.animals.add(animal);
        return this;
    }
}

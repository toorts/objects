import child.*;
import parent.*;
import impl.*;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Puss"))
                .addAnimal(new Dog("Cosmo"))
                .addAnimal(new Duck("Donald"))
                .addAnimal(new Falcon("Sam"))
                .addAnimal(new Crocodile("Gena"))
                .addAnimal(new Shark("Jose"))
                .addAnimal(new Doctor("Strange"));

        System.out.println("All animals:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nRunning animals:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + "\n" + r.getRunningSpeed());
        }

        System.out.println("\nSwimming animals:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + "\n" + s.getSwimmingSpeed());
        }

        System.out.println("\nFlying animals:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + "\n" + f.getFlightSpeed());
        }


        System.out.println("\nHead physician of this clinic:");
        System.out.println(vetClinic.getHeadPhysician());
        vetClinic.getHeadPhysician().speak();
        vetClinic.getHeadPhysician().work();

    }
}
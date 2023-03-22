package child;

import impl.Runnable;
import impl.Swimmable;
import parent.Animal;

public class Crocodile extends Animal implements Swimmable, Runnable {
    public Crocodile(String name, String color) {
        super(name, color, 4);
    }

    public Crocodile(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Crank!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getRunningSpeed() {
        return 5;
    }

    @Override
    public int getSwimmingSpeed() {
        return 25;
    }
}

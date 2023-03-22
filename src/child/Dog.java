package child;

import impl.Runnable;
import impl.Swimmable;
import parent.Animal;

public class Dog extends Animal implements Runnable, Swimmable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getRunningSpeed() {
        return 40;
    }

    @Override
    public int getSwimmingSpeed() {
        return 5;
    }

}

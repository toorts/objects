package child;

import impl.Runnable;
import parent.Animal;

public class Cat extends Animal implements Runnable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getRunningSpeed() {
        return 20;
    }
}

package child;

import parent.Animal;

public class Shark extends Animal {
    public Shark(String name, String color) {
        super(name, color,0);
    }

    public Shark(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Jaaws!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 20;
    }
}

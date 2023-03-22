package child;

import parent.Animal;

public class Dog extends Animal {
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
    public void hunt() {}

    @Override
    public int getRunningSpeed() {
        return 40;
    }

    @Override
    public int getSwimmingSpeed() {
        return 5;
    }

}

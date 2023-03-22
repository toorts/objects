package child;

import parent.Animal;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 70;
    }

    @Override
    public int getRunningSpeed() {
        return 5;
    }

    @Override
    public int getSwimmingSpeed() {
        return 3;
    }
}

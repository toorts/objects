package child;

import impl.Flyable;
import parent.Animal;

public class Falcon extends Animal implements Flyable {
    public Falcon(String name, String color) {
        super(name, color, 2);
    }

    public Falcon(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Piiiioww!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getFlightSpeed() {
        return 80;
    }
}

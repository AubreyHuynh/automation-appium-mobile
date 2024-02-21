package Java.Labs.lab_7_2;

import java.security.SecureRandom;

// Horse class, subclass of Animal
public class Horse extends Animal {
    // Override the speed method for horse
    @Override
    public int speed() {
        return new SecureRandom().nextInt(76); // Random speed between 0 and 75
    }
}
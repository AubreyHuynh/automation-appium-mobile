package Java.Labs.lab_7_2;

import java.security.SecureRandom;

// Base class Animal
public class Animal {
    // Method to return a random speed for each animal
    public int speed() {
        return new SecureRandom().nextInt(50); // Random speed between 0 and 49
    }
}
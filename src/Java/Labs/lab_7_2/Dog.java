package Java.Labs.lab_7_2;

import java.security.SecureRandom;

// Dog class, subclass of Animal
public class Dog extends Animal {
    // Override the speed method for dog
    @Override
    public int speed() {
        return new SecureRandom().nextInt(61); // Random speed between 0 and 60
    }
}

package Java.Labs.lab_7_2;

import java.security.SecureRandom;

// Tiger class, subclass of Animal
public class Tiger extends Animal {
    // Override the speed method for tiger
    @Override
    public int speed() {
        return new SecureRandom().nextInt(101); // Random speed between 0 and 100
    }
}
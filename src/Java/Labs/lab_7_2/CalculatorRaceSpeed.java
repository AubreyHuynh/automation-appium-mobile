package Java.Labs.lab_7_2;

public class CalculatorRaceSpeed {
    public static void main(String[] args) {
        // Create objects for each animal type
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        // Get speeds of each animal
        int horseSpeed = horse.speed();
        int tigerSpeed = tiger.speed();
        int dogSpeed = dog.speed();

        // Find the fastest animal
        String winner;
        int maxSpeed = Math.max(horseSpeed, Math.max(tigerSpeed, dogSpeed));
        if (maxSpeed == horseSpeed) {
            winner = "Horse";
        } else if (maxSpeed == tigerSpeed) {
            winner = "Tiger";
        } else {
            winner = "Dog";
        }

        // Print the result
        System.out.println("Winner is " + winner + ", with speed: " + maxSpeed + " km/h");
    }
}

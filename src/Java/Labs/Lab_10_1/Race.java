package Java.Labs.Lab_10_1;

public class Race {
    public static Animal determineWinner(Animal[] animals) {
        Animal winner = null;
        int maxSpeed = 0;

        for (Animal animal : animals) {
            if (animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                winner = animal;
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        Animal horse = new Horse.HorseBuilder().build();
        Animal tiger = new Tiger.TigerBuilder().build();
        Animal dog = new Dog.DogBuilder().build();

        Animal[] animals = {horse, tiger, dog};

        Animal winner = determineWinner(animals);

        System.out.println("Winner is " + winner.getName() + ", with speed: " + winner.getSpeed() + " Km/h");
    }
}

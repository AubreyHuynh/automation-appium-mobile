package Java.Labs.Lab_10_1;

class Dog extends Animal {
    protected Dog(DogBuilder builder) {
        super(builder);
    }

    @Override
    public String getName() {
        return "Dog";
    }

    public static class DogBuilder extends AnimalBuilder {
        public DogBuilder() {
            this.name("Dog");
            this.speed(60);
            this.flyable(false);
        }

        @Override
        public Dog build() {
            return new Dog(this);
        }
    }
}

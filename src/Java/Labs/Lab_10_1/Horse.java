package Java.Labs.Lab_10_1;

class Horse extends Animal {
    protected Horse(HorseBuilder builder) {
        super(builder);
    }

    @Override
    public String getName() {
        return "Horse";
    }

    public static class HorseBuilder extends AnimalBuilder {
        public HorseBuilder() {
            this.name("Horse");
            this.speed(75);
        }

        @Override
        public Horse build() {
            return new Horse(this);
        }
    }
}

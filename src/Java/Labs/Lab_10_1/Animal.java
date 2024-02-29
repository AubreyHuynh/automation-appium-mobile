package Java.Labs.Lab_10_1;

abstract class Animal {
    private String name;
    private int speed;

    protected Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
    }

    public abstract String getName();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static abstract class AnimalBuilder {
        private String name;
        private int speed;

        public AnimalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public abstract Animal build();
    }
}

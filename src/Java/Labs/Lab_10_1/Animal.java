package Java.Labs.Lab_10_1;

abstract class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    protected Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public abstract String getName();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static abstract class AnimalBuilder {
        private String name;
        private int speed;
        private boolean flyable;

        public AnimalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalBuilder flyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public abstract Animal build();
    }
}

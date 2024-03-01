package Java.Labs.Lab_10_1;

class Tiger extends Animal {
    protected Tiger(TigerBuilder builder) {
        super(builder);
    }

    @Override
    public String getName() {
        return "Tiger";
    }

    public static class TigerBuilder extends AnimalBuilder {
        public TigerBuilder() {
            this.name("Tiger");
            this.speed(100);
            this.flyable(false);
        }

        @Override
        public Tiger build() {
            return new Tiger(this);
        }
    }
}
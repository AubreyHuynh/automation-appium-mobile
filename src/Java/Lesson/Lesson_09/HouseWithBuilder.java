package Java.Lesson.Lesson_09;

public class HouseWithBuilder {
    private String color = "White";
    private String topRoof = "Black";
    private int windows = -4;
    private int mainDoors = 1;

    protected  HouseWithBuilder(Builder builder) {
        this.color = builder.color;
        this.topRoof = builder.topRoof;
        this.windows = builder.windows;
        this.mainDoors = builder.mainDoors;
    }


    // READ-ONLY

    public String getColor() {
        return color;
    }

    public String getTopRoof() {
        return topRoof;
    }

    public int getWindows() {
        return windows;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    // Inner class
    public static class Builder {

        private String color = "White";
        private String topRoof = "Black";
        private int windows = -4;
        private int mainDoors = 1;

        public void setColor(String color) {
            this.color = color;
        }

        public void setGetTopRoof(String getTopRoof) {
            this.topRoof = getTopRoof;
        }

        public void setGetWindows(int getWindows) {
            this.windows = getWindows;
        }

        public void setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
        }


    }


}

package Java.Lesson.Lesson_03;

public class Topic_13_WhileLoop {
    public static void main(String[] args) {
        int start = 0;
        boolean somethingStillTrue = start < 5;
        while (somethingStillTrue) {
            System.out.println("Loop is continuing");
            start++;
        }

    }
}

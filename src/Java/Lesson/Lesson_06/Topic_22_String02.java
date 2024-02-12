package Java.Lesson.Lesson_06;

public class Topic_22_String02 {

    public static void main(String[] args) {
        // Immutable and replace method
        String badWordContainer = "bad, very bad sth else, bad! !";
        String filteredStr = badWordContainer.replace("bad", "***");
        System.out.println(filteredStr);
    }
}

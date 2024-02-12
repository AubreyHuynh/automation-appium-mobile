package Java.Lesson.Lesson_01;

public class Topic_01_Hello_World {

    public static void main(String[] args) {
        
        System.out.println("Hello world!");

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }
    }

    // Readability (Dễ đọc, hiểu)
    // Maintenance (Dễ bảo trì) <-- DRY principle, Single Responsibility
    // Extendable
}

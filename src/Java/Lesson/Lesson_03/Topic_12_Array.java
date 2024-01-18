package Java.Lesson.Lesson_03;

public class Topic_12_Array {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int [] myIntArray = new int[ARRAY_LENGTH];

        for (int index = 0; index < ARRAY_LENGTH; index++) {
            myIntArray[index] = index;
            System.out.println(myIntArray[index]);
        }

        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}

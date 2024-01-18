package Java.Lesson.Lesson_01;

public class Topic_02_Variable {

    public static void main(String[] args) {
        // naming convention: camelCase, snake_case, PascalCase
        int myInt = 19;
        // Re-assign value
        myInt = 18;
        // Re-declaration is NOT allowed
        // int myInt = 20;

        int my_num = 18;
        int MyValue = 10;

        long myLongNum = 10L;
        float myFloatNum = 3.14f;
        double myDoubleNum = 3.14d;

        boolean myDecision01 = true;
        boolean myDecision02 = false;

        // byte, short, int, long
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        // incompatible types: possible lossy conversion from int to byte
        // byte myByte = 326;

        // Character
        final float PI_NUMBER = 3.14f;
        // cannot re-assign final variable
        // PI_NUMBER = 3.15f;


    }
}

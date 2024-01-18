package Java.Lesson.Lesson_02;

public class Topic_04_Prefix_Postfix {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Prefix(++a), b(++)Postfix
        int c = ++a + b++;

        /*
        * prefix > right operand > assign value for left operand > postfix
        * a = 2
        * c = 4
        * b = 3
        **/

        System.out.printf("a = %d; b = % d; c = %d\n", a, b, c);
    }
}

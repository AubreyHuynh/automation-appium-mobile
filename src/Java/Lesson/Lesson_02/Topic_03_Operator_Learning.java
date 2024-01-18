package Java.Lesson.Lesson_02;

public class Topic_03_Operator_Learning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // Left operand and Right operand
        int total_ = myNum1 + myNum2;
        System.out.println("Total: " + total_);

        // Print with format: %d, %f, %b, %s
        System.out.printf("Total: %d\n", total_);

        // Chia lây phần nguyên
        System.out.printf("\tPhép chia %d cho %d,có phần nguyên là %d\n", 5, 2, 5 / 2);

        // Chia lây phần dư
        System.out.printf("\tPhép chia %d cho %d,có phần dư là %d\n", 5, 2, 5 % 2);

        float myFloatNum = 10/3f;
        System.out.println(myFloatNum);

        double myDoubleNum = 10/3d;
        System.out.println(myDoubleNum);
    }
}

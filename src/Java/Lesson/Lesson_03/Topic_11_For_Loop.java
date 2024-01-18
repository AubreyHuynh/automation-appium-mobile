package Java.Lesson.Lesson_03;

public class Topic_11_For_Loop {
    public static void main(String[] args) {

        int start = 0;
        for (;start < 5; start++) {
            // Code block/ for loop code body
            System.out.println(start + 1);
        }

//        System.out.printf("Final value of start is %d", start);

        /*
        * start = 0
        * xét 0 < 5 ko? --> true
        * print start + 1 --> 0 + 1
        * start++ --> start = 1
        * ...
        * ... --> start = 5
        * 5 < 5: false
        * */
    }
}

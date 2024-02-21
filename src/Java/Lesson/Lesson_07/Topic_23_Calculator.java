package Java.Lesson.Lesson_07;

public class Topic_23_Calculator {
    // Without params
    /*
    [access modifier] = public, private
    [access modifier] | class method/ or NOT optional | return type | function's name (params){...}
    public | static | void/ int/ string | sum (int num1, int num2)
    */

    public static void welcome(String name) {
        System.out.println("Welcome ".concat(name));
    }

    // Method signature
    public static int sum (int num1, int num2) {
        System.out.println("Calling sum2");
        int total = num1 + num2;
        return total;
    }

    public static int sum (int num1, int num2, int num3) {
        System.out.println("Calling sum3");
        int total = num1 + num2 + num3;
        return total;
    }

    // Varargs | Rest parameters
    public static int sum (int... nums) {
//        if (nums.length == 0) {
//            throw new IllegalArgumentException("At least 2 number");
//        }
        int total = 0;
        for (int value : nums) {
            total += value;
        }
        return total;
    }

    /*
    * Overloading?
    * . SAME class
    * . Compile time
    * . Base on method signature: SAME function name + DIFFERENT params --> Overloading
    * */



}

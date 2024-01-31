package Java.Lesson.Lesson_06;

import java.util.HashMap;
import java.util.Map;

public class Topic_21_HashMap {
    public static void main(String[] args) {
        // CRUD
        Map<Integer, String> emergencyList = new HashMap<>();
        // Adding a new entry into a map
        emergencyList.put(113, "Police Dept");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Others");

        // Read on value
        System.out.println(emergencyList.get(113));

    }
}

package Java.Lesson.Lesson_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Topic_21_HashMap {

    public static void main(String[] args) {
        // CRUD
        Map<Integer, String> emergencyList = new HashMap<>();

        // Adding a new entry into a map
        emergencyList.put(113, "Police Dept");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Others");
        System.out.println(emergencyList.get(116));

        // Không cho trùng key
        // Read on value
        emergencyList.put(116, "Something Else");
        System.out.println(emergencyList.get(116));
        System.out.println(emergencyList.get(117));

        // Update
        emergencyList.replace(116, "ABC");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "ABC", "XYZ");
        System.out.println(emergencyList.get(116));

        // Remove/Delete entry out of the map
        emergencyList.remove(116, "123");
        System.out.println(emergencyList.get(116));

        emergencyList.remove(116);
        System.out.println(emergencyList.get(116));
        System.out.println("=============");

        // Loop over the map
        emergencyList.put(116, "Others");
        Set<Integer> keys = emergencyList.keySet();
        for (int key : keys) {
            System.out.println(emergencyList.get(key));
        }

        // Loop over the entries, if the entry has value 'Others' --> Remove from the map
        System.out.println("======= Loop over the entries, if the entry has... =======");

        for (int key : keys) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.remove(key);
            }
        }

    }
}

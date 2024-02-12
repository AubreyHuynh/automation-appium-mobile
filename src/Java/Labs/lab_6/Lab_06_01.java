package Java.Labs.lab_6;

public class Lab_06_01 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";

        // Split the input string by spaces
        String[] parts = inputString.split("\\s+");

        int totalMinutes = 0;

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("hrs")) {
                // Extract hours and convert to minutes
                int hours = Integer.parseInt(parts[i].replace("hrs", ""));
                totalMinutes += hours * 60;
            } else if (parts[i].equals("and")) {
                // Skip "and" part
                continue;
            } else if (parts[i].equals("minutes")) {
                // Extract minutes
                int minutes = Integer.parseInt(parts[i - 1]);
                totalMinutes += minutes;
            }
        }

        System.out.println("Total minutes: " + totalMinutes);
    }
}

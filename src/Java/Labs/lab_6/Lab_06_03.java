package Java.Labs.lab_6;

public class Lab_06_03 {
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        String extractedDigits = extractDigits(myStr);
        System.out.println("Extracted digits: " + extractedDigits);
    }

    public static String extractDigits(String input) {
        StringBuilder extractedDigits = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                extractedDigits.append(ch);
            }
        }

        return extractedDigits.toString();
    }
}

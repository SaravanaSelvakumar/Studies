public class Student {
    public static void main(String[] args) {
        // Given strings
        String name = "sam 67";
        String name2 = "tom 67";

        // Extract the last two numbers from the strings
        int lastTwoDigitsName = extractLastTwoDigits(name);
        int lastTwoDigitsName2 = extractLastTwoDigits(name2);

        // Add the last two digits
        int sum = lastTwoDigitsName + lastTwoDigitsName2;

        // Print the result
        System.out.println("Sum of the last two digits: " + sum);
    }

    // Method to extract the last two digits from a string
    private static int extractLastTwoDigits(String str) {
        String lastTwoDigits = str.substring(str.length() - 2);
        return Integer.parseInt(lastTwoDigits);
    }
}

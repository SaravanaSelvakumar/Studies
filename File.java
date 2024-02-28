import java.util.*;

public class File {
    public static void main(String[] args) {
        String sen = "Search the world's information, including webpages, images, videos and more";
        String low = sen.toLowerCase();
        String[] arr = low.split(" ");

        // HashMap to store character frequencies
        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (String word : arr) {
            char[] c = word.toCharArray();
            for (char ch : c) {
                // Increment frequency count
                if (Character.isLetter(ch)) {
                    charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
                }
            }
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        char maxChar = '\0'; // Character with maximum frequency
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Print the character with maximum frequency and its count
        System.out.println("Character with maximum frequency: " + maxChar);
        System.out.println("Maximum frequency: " + maxFrequency);
    }
}


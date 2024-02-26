import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("sivakumar");
        words.add("communication");
        words.add("management");
        words.add("ground management");
        for (String word : words) {
            if (countVowels(word) > 3) {
                System.out.println("Word: " + word + ", First letter: " + word.charAt(0) + ", Last letter: " + word.charAt(word.length() - 1));
            }
        }
    }

    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

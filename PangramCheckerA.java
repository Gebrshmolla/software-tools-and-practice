import java.util.HashSet;
import java.util.Set;

public class PangramCheckerA {
    public static boolean isPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet.remove(c);
            }
        }

        return alphabet.isEmpty();
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (isPangram(sentence)) {
            System.out.println(sentence + " is a pangram.");
        } else {
            System.out.println(sentence + " is not a pangram.");
        }
    }
}
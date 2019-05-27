import java.util.HashSet;

public class FirstRecurring {
    public String findFirstRecurring(String sequence) {
        // HashSet to store characters that have shown up so far
        HashSet chars = new HashSet();

        // If the char is already in the set it is the first recurring character, return it
        for (char ch : sequence.toCharArray()) {
            if (chars.contains(ch)) {
                String s = String.valueOf(ch);
                return s;
            }

            // Char has not shown up yet, add it to hash set
            chars.add(ch);
        }
        return null;
    }
}

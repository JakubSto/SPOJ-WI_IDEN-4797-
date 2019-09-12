import java.util.List;

public class DeleteVowel {
    static String deleteVowel(String words, int chars) {
        int counterOfChars = words.length();
        int charsToDelete = counterOfChars - chars;
        words = words.toLowerCase();

        List<Character> vowels = List.of('a', 'ą', 'e', 'ę', 'i', 'o', 'u', 'ó', 'y');

        for (int i = 1; i < words.length(); i++) {
            if (vowels.contains(words.charAt(i))) {
                StringBuffer str = new StringBuffer(words);
                words = str.delete(i, i + 1).toString();
               i = checkCharsToDelete(--charsToDelete,--i, counterOfChars);
            }
        }
        return words;
    }

    static int checkCharsToDelete(int charsToDelete, int i, int counterOfChars){
        if (0 == charsToDelete){
            return counterOfChars+1;
        }
        return i;
    }
}

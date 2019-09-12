import java.util.List;

public class DelateVovel {
    static String delateVovel(String words, int chars) {
        int counterOfChars = words.length();
        int charsToDelate = counterOfChars - chars;
        words = words.toLowerCase();

        List<Character> vowels = List.of('a', 'ą', 'e', 'ę', 'i', 'o', 'u', 'ó', 'y');

        for (int i = 1; i < words.length(); i++) {
            if (vowels.contains(words.charAt(i))) {
                StringBuffer str = new StringBuffer(words);
                words = str.delete(i, i + 1).toString();
               i = checkCharsToDelate(--charsToDelate,--i, counterOfChars);
            }
        }
        return words;
    }

    static int checkCharsToDelate (int charsToDelate, int i, int counterOfChars){
        if (0 == charsToDelate){
            return counterOfChars+1;
        }
        return i;
    }
}

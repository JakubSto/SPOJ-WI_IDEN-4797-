public class DelateVovel {
    static String delateVovel(String words, int chars) {
        int counterOfChars = words.length();
        int charsToDelate = counterOfChars - chars;
        words = words.toLowerCase();

        for (int i = 1; i < words.length(); i++) {
            if (words.charAt(i) == 'a' || words.charAt(i) == 'ą' || words.charAt(i) == 'e' || words.charAt(i) == 'ę'|| words.charAt(i) == 'i'
                    || words.charAt(i) == 'o' || words.charAt(i) == 'u' || words.charAt(i) == 'ó' || words.charAt(i) == 'y') {
                StringBuffer str = new StringBuffer(words);
                words = str.delete(i, i + 1).toString();
                checkCharsToDelate(--charsToDelate,++i, counterOfChars);
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

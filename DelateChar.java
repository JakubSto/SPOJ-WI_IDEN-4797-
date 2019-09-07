public class DelateChar {
    static String delateChar(String words, int chars) {
        int counterOfChars = words.length();
        int charsToDelate = counterOfChars - chars;

        for (int i = counterOfChars-1; i > 0; i--){
            if (words.charAt(i) == '_'){
                StringBuffer str = new StringBuffer(words);
                words = str.delete(i,i+1).toString();
                checkCharsToDelate(--charsToDelate,--i);
            }
        }
        return words;
    }

    static int checkCharsToDelate (int charsToDelate, int i){
        if (0 == charsToDelate){
            return -1;
        }
        return i;
    }
}

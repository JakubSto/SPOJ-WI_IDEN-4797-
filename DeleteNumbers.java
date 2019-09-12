public class DeleteNumbers {
    static String deleteNumber(String words, int chars) {
        int counterOfChars = words.length();
        int charsToDelete = counterOfChars - chars;

        for (int i = counterOfChars - 1; i > 0; i--) {
            int ascii = words.charAt(i);
            if (ascii > 47 && ascii < 58) {
                StringBuffer str = new StringBuffer(words);
                words = str.delete(i, i + 1).toString();
                i = checkCharsToDelete(--charsToDelete,--i);
            }
        }
        return words;
    }

    static int checkCharsToDelete(int charsToDelete, int i){
        if (0 == charsToDelete){
            return -1;
        }
        return i;
    }

}

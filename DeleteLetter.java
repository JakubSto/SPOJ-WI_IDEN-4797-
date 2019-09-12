public class DeleteLetter {
    static String deleteLetter(String words, int chars) {
        int counterOfChars = words.length();
        int charsToDelete = counterOfChars - chars;

        for (int i = counterOfChars - 2; i > 0; i--) {
                StringBuffer str = new StringBuffer(words);
                words = str.delete(i, i + 1).toString();
                i = checkCharsToDelete(--charsToDelete,--i);
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

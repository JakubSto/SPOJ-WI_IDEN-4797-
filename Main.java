import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //------Inputs------------------------------------------------//

        Scanner scan = new Scanner(System.in);
        String charsString = scan.nextLine();
        int chars = Integer.parseInt(charsString);
        String words = scan.nextLine();

        // ----------------------------------------------------------- //

        if (words.length() <= chars){
            System.out.println(words);
        }
        else{
            System.out.println(delateChar(words, chars));
        }
    }

    //------Methods----------------------------------------------------//

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

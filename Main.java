import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //------Inputs------------------------------------------------//

        Scanner scan = new Scanner(System.in);
        String charsString = scan.nextLine();
        int chars = Integer.parseInt(charsString);
        String words = scan.nextLine();

        // ----------------------------------------------------------- //
        int i = 1;
        switch (i) {
            case 1:
                if (finished(words, chars))
                    break;
            case 2:
                words = DeleteChar.deleteChar(words, chars);
                System.out.println(words);
                if (finished(words, chars))
                    break;
            case 3:
                words = DeleteNumbers.deleteNumber(words, chars);
                System.out.println(words);
                if (finished(words, chars))
                    break;
            case 4:
                words = DeleteVowel.deleteVowel(words, chars);
                System.out.println(words);
                if (finished(words, chars))
                    break;
            case 5:
                words = DeleteLetter.deleteLetter(words, chars);
        }
        System.out.println(words);

    }

    static boolean finished(String words, int chars) {
        return words.length() <= chars;
    }
}
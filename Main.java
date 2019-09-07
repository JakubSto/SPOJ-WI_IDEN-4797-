import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //------Inputs------------------------------------------------//

        Scanner scan = new Scanner(System.in);
        String charsString = scan.nextLine();
        int chars = Integer.parseInt(charsString);
        String words = scan.nextLine();

        // ----------------------------------------------------------- //

        if (finished(words,chars)){
            System.out.println(words);
        }
        else {
            words = DelateChar.delateChar(words, chars);
        }
            words = DelateNumbers.delateNumber(words,chars);
            System.out.println(words);

    }
    static boolean finished (String words, int chars){
        if (words.length() <= chars){
            return true;
        }
        return false;
    }
}

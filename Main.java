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
        switch(i){
            case 1:
                if (finished(words,chars))
                    break;
            case 2:
                words = DelateChar.delateChar(words, chars);
                if (finished(words,chars))
                    break;
            case 3:
                words = DelateNumbers.delateNumber(words,chars);
                if (finished(words,chars))
                    break;
            case 4:
            case 5:
        }
        System.out.println(words);

    }
    static boolean finished (String words, int chars){
        if (words.length() <= chars){
            return true;
        }
        return false;
    }
}

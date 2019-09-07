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
            System.out.println(DelateChar.delateChar(words, chars));
        }
        if(words.length() != chars){

        }
    }
}

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String reverseString  = reverseString(word);
        System.out.println(reverseString);
    }

    public static String reverseString(String input) {
        String output = "";
        for(int i = input.length() -1 ; i > -1; i--){
            output = output + input.charAt(i);
        }
        return output;
    }

}

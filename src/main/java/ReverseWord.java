import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String reverseString  = reverseString(word);
        System.out.println(reverseString);
    }

    public static String reverseString(String input) {
        StringBuilder output = new StringBuilder();
        for(int i = input.length() -1 ; i > -1; i--){
            output.append(input.charAt(i));
        }
        return output.toString();
    }

}

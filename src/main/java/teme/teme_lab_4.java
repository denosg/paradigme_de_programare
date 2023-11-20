package teme;

public class teme_lab_4 {

    public static void main(String[] args) {
        System.out.println(returnMiddleChars("masina"));
    }

    public static String returnMiddleChars(String word){
        final int wordLength = word.length();
        String returnString = "";
        if(wordLength%2 == 0){
            returnString = returnString + word.charAt(wordLength/2-1) + word.charAt(wordLength/2);
        }else{
            returnString = returnString + word.charAt(wordLength/2);
        }
        return returnString;
    }
}

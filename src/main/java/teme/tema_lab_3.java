package teme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class tema_lab_3 {

    public static void main(String[] args) {
    }

    public static List<String> findSameWordsFromTwoLists(List<String> firstList, List<String> secondList) {
        List<String> returnList = new ArrayList<>();
        for(String word : firstList){
            if(secondList.contains(word)){
                returnList.add(word);
            }
        }
        return returnList;
    }

    public static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isPalindrome(String word){
        final int wordLength = word.length();
        for(int i = 0; i < wordLength/2; i++){
            if(word.charAt(i) != word.charAt(wordLength-1-i)){
                return false;
            }
        }
        return true;
    }

}

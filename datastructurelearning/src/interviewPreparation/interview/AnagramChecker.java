package interviewPreparation.interview;

import java.util.Arrays;

public class AnagramChecker {

    static boolean anagramChecker(String str1,String str2){

        String cleanStr = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if(cleanStr.length()!=cleanStr2.length()){
            return false;
        }

        char[] charArray = cleanStr.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray,charArray2);


    }

    public static void main(String[] args) {
            boolean anagramChecker = anagramChecker("Google","Goggle");
        System.out.println(anagramChecker);
    }
}

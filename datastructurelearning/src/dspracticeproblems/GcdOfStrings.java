package dspracticeproblems;

public class GcdOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        return gcd(str1,str2);
    }

    public static String gcd(String str1, String str2){
        // If str1 length is less than
        // that of str2 then recur
        // with gcd(str2, str1)
        if (str1.length() < str2.length()) {
            return gcd(str2, str1);
        } // If str1 is not the
        // concatenation of str2
        else if (!str1.startsWith(str2)) {
            return "";
        } else if (str2.isEmpty()) {

            // GCD string is found
            return str1;
        }  else {

            // Cut off the common prefix
            // part of str1 & then recur
            return gcd(str1.substring(str2.length()),
                    str2);
        }
    }
}

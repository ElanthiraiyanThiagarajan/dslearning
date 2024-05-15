package dspracticeproblems;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int i = s.length() - 1;
        int count = 0;
        while ((i >= 0) && s.charAt(i) == ' ') {
            i--;
        }
        while ((i >= 0) && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        System.out.println(count);
    }
}

package dspracticeproblems;

public class LengthOfTheSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfTheSubstring("abcabcbb"));
    }

    static Integer lengthOfTheSubstring(String input) {
        Integer[] chars = new Integer[128];

        var res = 0;

        var right = 0;
        var left = 0;

        while (right<input.length()) {
            char r = input.charAt(right);
            Integer index = chars[r];
            if(index!=null && index>=left && index<right){
                left = index+1;
            }

            res = Math.max(res, right-left+1);

            chars[r] = right;
            right++;
        }

        return res;
    }
}

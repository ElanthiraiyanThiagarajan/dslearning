package dspracticeproblems;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String firstIndex = strs[0];
        String lastIndex = strs[strs.length - 1];
        int length = Math.min(firstIndex.length(), lastIndex.length());
        for (int i = 0; i < length; i++) {
            if (firstIndex.charAt(i) != lastIndex.charAt(i)) {
                return sb.toString();

            }
            sb.append(firstIndex.charAt(i));
        }
        return sb.toString();
    }

    public String longestCommonPrefix1(String[] strs) {
        int len = strs.length;
        String prefix = strs[0];
        for (int i = 1; i < len; i++) {
            while (strs[i].indexOf(prefix)!= 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }



    public static void main(String[] args) {
        LongestCommonPrefix lc = new LongestCommonPrefix();
        String ans = lc.longestCommonPrefix1(new String[]{"flower","flow","flight"});
        if (ans.isEmpty()) {
            System.out.println("No common prefix");
        } else {
            System.out.println(ans);
        }
    }
}

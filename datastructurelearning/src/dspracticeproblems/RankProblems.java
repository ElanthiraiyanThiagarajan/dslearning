package dspracticeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RankProblems {

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] t = arr.clone();
        Arrays.sort(t);
        int m = 0;
        for (int i = 0; i < n; ++i) {
            if (i == 0 || t[i] != t[i - 1]) {
                t[m++] = t[i];
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = Arrays.binarySearch(t, 0, m, arr[i]) + 1;
        }
        return ans;
    }

    public static List<Integer> targetIndices(int[] nums, int target) {

        int belowCount = 0, tCount = 0;

        for(Integer i : nums) {
            if(i < target) {
                belowCount++;
            }else if(i == target) {
                tCount++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(var t = 0; t < tCount; t++) {
            ans.add(belowCount++);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrayRankTransform(arr)));
        System.out.println(targetIndices(arr, 3));
    }


}

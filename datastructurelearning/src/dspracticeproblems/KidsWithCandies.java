package dspracticeproblems;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if(candies.length == 0) return new  ArrayList<>();

        int maxCandies = findGreatest(candies);

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }

    private static int findGreatest(int[] arr){
        var max = Integer.MIN_VALUE;
        for (var j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}

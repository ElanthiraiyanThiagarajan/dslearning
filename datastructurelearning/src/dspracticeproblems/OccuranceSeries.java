package dspracticeproblems;

import java.util.*;

public class OccuranceSeries {

    public static void main(String[] args) {

        int[] input =new int[] {2, 5, 2, 6, 8, 5, 8, 8};
        int[] output = new int[input.length];
        List<Integer> list = new ArrayList<>();

        Arrays.sort(input);

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int count = countMap.getOrDefault(input[i], 0) + 1;
            countMap.put(input[i], count);
            list.add(input[i]);
        }

        // Compare the map by value
        SortComparator comp = new SortComparator(countMap);

        // Sort the map using Collections CLass
        Collections.sort(list, comp);

        // Final Output
        for (Integer i : list) {
            System.out.print(i + " ");
        }

//        while(n>0){
//            int temp = n%10;
//            sum = sum + temp;
//            n=n/10;
//        }
//
//        System.out.println(sum);




    }
}

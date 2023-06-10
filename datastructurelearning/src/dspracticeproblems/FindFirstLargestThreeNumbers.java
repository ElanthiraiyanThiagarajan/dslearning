package dspracticeproblems;

import java.util.Arrays;

public class FindFirstLargestThreeNumbers {

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 13, 1, 10, 34, 16};
        // Arrays.sort(arr);
        int first =arr[0];
        int second = 0;
        int third = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>first){
                third = second;
                second= first;
                first = arr[i];
            }else if(arr[i]>second){
                third = second;
                second = arr[i];

            }else if(arr[i]>third){
                third = arr[i];
            }
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

}

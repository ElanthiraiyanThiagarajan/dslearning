package dspracticeproblems;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0,end=arr.length-1;

        while(start<end){
            var temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }

        System.out.println(Arrays.toString(arr));

    }
}

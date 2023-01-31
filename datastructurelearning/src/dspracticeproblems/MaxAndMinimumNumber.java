package  dspracticeproblems;
import java.util.Arrays;

public class MaxAndMinimumNumber {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 7, 1, 3, 9 };
        positiveMinAndMax(arr);
        // int max = arr[0];
        // int min = arr[0];
        // for (var i = 1; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }

        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }

        // System.out.println(max);
        // System.out.println(min);

    }

    static void positiveMinAndMax(int[] arr) {
        Arrays.sort(arr);
        int max = 0, min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
        }

        for (int j = 0; j < arr.length; j++) {
            max += arr[j];
        }

        System.out.println(min);
        System.out.println(max);
    }
}

package algorithms;

import java.util.Arrays;
public class ThreeSumFast {

   public static boolean containsDuplicates(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) return true;
        }
        return false;
    }

    public static void printAll(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) StdOut.println(a[i] + " " + a[j] + " " + a[k]);
            }
        }
    }

    public static Integer count(int[] a) {
        int length = a.length, count = 0;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
               int k= Arrays.binarySearch(a, -(a[i]+a[j]));
               if(k>j) count++;
            }
        }
        return count;
    }
    
}

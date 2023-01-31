package  dspracticeproblems;
public class MoveAllZerosToEnd {

    static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 0, 4, 5, 0 };
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, j, i);
                j++;

            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}

package algorithmsdefaultProgram;

public class SortingAlgorithms {

    static void bubbleSort(int[] arr) {
        var length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapping(arr, j, j + 1);
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        var length = arr.length;
        for (var i = 0; i < length - 1; i++) {
            var mib_idx = i;
            for (var j = i + 1; j < length; j++) {
                if (arr[j] < arr[mib_idx])
                    mib_idx = j;
            }
            swapping(arr, mib_idx, i);
            // var temp = arr[mib_idx];
            // arr[mib_idx] = arr[i];
            // arr[i] = temp;

        }

        for (var number : arr) {
            System.out.print(number + " ");
        }

    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int b = arr[i];

            while (j >= 0 && b <= arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = b;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swapping(arr, i, j);
            }
        }
        swapping(arr, i + 1, high);
        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = partition(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);

        }

    }

    static void swapping(int[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 6, 7, 5, 1 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}

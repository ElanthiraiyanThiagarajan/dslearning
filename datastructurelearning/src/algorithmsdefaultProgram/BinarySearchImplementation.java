package algorithmsdefaultProgram;

public class BinarySearchImplementation {

    static int binarySearch(int[] arr, int key, int start, int end) {

        if (start <= end) {
            int middle = (start + end) / 2;

            if (key == arr[middle]) {
                return middle;
            }

            if (key > arr[middle]) {
                return binarySearch(arr, key, middle + 1, end);
            } else {
                return binarySearch(arr, key, start, middle - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 5, 7, 9, 11 };
        int output = binarySearch(arr, 9, 0, arr.length - 1);
        if (output == -1) {
            System.out.println("The given is not found");
        } else {
            System.out.println("The given key is found at index  " + output);
        }

    }
}

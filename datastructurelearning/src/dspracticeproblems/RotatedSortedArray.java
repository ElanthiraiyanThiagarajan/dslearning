package dspracticeproblems;

public class RotatedSortedArray {

    public static int serach(int nums[], int target) {

        int length = nums.length;
        int left = 0, right = length - 1;
        // Find the index of the pivot element (the smallest element)

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[length - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Binary search over elements on the pivot element's left
        int answer = binarySearch(nums, 0, left, target);
        if (answer != -1) {
            return answer;
        }
        // Binary search over elements on the pivot element's right

        return binarySearch(nums, left, length - 1, target);
    }

    // Binary search over an inclusive range [left_boundary ~ right_boundary]
    private static int binarySearch(int[] nums, int leftBoundary, int rightBoundary, int target) {
        while (leftBoundary <= rightBoundary) {
            int middle = (leftBoundary + rightBoundary) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                rightBoundary = middle - 1;
            } else {
                leftBoundary = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(serach(nums, 1));

    }

}

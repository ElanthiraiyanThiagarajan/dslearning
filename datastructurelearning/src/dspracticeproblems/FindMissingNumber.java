package dspracticeproblems;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,5};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] numbs) {
        var n = numbs.length;
        var expectedSum = (n * (n + 1)) / 2;
        var actualSum = 0;

        for (int num : numbs) {
            actualSum = actualSum + num;
        }

        return expectedSum - actualSum;
    }
}

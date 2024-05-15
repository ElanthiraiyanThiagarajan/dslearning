package dspracticeproblems;

public class FindMaxThreeNumbers {

    public static void main(String[] args) {
        findMaxThreeNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    private static void findMaxThreeNumbers(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return;
        }

       int max1,max2,max3;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for (int number : numbers) {
//            System.out.println(numbers[i]);
            if (number > max1) {
                max3 = max2;
                max2 = max1;
                max1 = number;
            } else if (number > max2 && max1 != number) {
                max3 = max2;
                max2 = number;
            } else if (max3 > number) {
                max3 = number;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

    }
}

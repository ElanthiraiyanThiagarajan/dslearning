package dspracticeproblems;

import java.util.Arrays;

public class TrainProblem {

    public static void main(String[] args) {
        Integer[] arrival = new Integer[]{900, 940, 950, 1100, 1500, 1800};
        Integer[] departure = new Integer[]{910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatFormUsingForLoop(arrival, departure, arrival.length));

    }

    static int findPlatForm(Integer[] arrival, Integer[] departure, int n) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform_needed = 1, i = 1, j = 0;
        int result = 1;

        while (i < n && j < n) {
            System.out.println("i= " + i + " j= " + j);
            System.out.println("arr[i]= " + arrival[i] + " departure[j]= " + departure[j]);
            if (arrival[i] <= departure[j]) {
                platform_needed++;
                i++;
            } else {
                platform_needed--;
                j++;
            }
            result = Math.max(result, platform_needed);
        }

        return result;
    }

    static int findPlatFormUsingForLoop(Integer[] arrival, Integer[] departure, int n) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform_needed = 1, result = 1;
        for (int i = 0; i < n; i++) {
            platform_needed = 1;
            System.out.println("arr[i]= " + arrival[i]);
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.println("i=" + i + " j=" + j);
                    System.out.println("arr[i]=" + arrival[i] + "arr[j]="+arrival[j] +" departure[j]=" + departure[j]);
                    System.out.println("arrival[i] >= arrival[j] && departure[j] >= arrival[i]"+ (arrival[i] >= arrival[j] && departure[j] >= arrival[i]));
                    if (arrival[i] >= arrival[j] && departure[j] >= arrival[i]) {
                        platform_needed++;
                    }
                    System.out.println(platform_needed);
                }
            }
            System.out.println();
            System.out.println();
            result = Math.max(result, platform_needed);

        }


        return result;
    }


}

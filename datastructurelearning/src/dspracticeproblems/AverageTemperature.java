package  dspracticeproblems;

import java.util.Scanner;


public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days?");

        int noOfDays = scanner.nextInt();
        int[] temp = new int[noOfDays];
        int sum = 0;
        for (int i = 0; i < noOfDays; i++) {
            temp[i] = scanner.nextInt();
            sum += temp[i];
        }

        var averageTemperature = sum / noOfDays;

        System.out.println("Average" + averageTemperature);
        int count = 0;
        for (int j = 0; j < temp.length; j++) {
            if (temp[j] > averageTemperature) {
                count++;
            }
        }

        System.out.println("No of Average days"+ count);

    }
}

package dspracticeproblems;

public class MissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,7,8,9,10};
//        System.out.println(missingNumber(numbers,numbers.length));
        System.out.println(getMissingNumber(numbers,numbers.length));
    }

    static  Integer getMissingNumber(int[] numbers,int length) {
        int sum = (length * (length + 1)) / 2;
        int sum1 =0;
//        int sum1 = ((length+2) * (length + 1)) / 2;
        for (int i = 0; i < length; i++) {
            sum1 += numbers[i];
        }
        return sum-sum1;
    }

    static Integer missingNumber(int[] numbers,int length) {
        int i;
        int[] temp = new int[length + 1];
        for (i = 0; i <= length; i++) {
            temp[i] = 0;
        }
        for (i = 0; i < length; i++) {
            temp[numbers[i]-1] =1;
        }

        int ans=0;
        for(i=0;i<=length;i++){
            if(temp[i]==0){
                ans=i+1;
            }
        }



        return ans;
    }
}

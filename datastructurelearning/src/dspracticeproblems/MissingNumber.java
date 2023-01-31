package  dspracticeproblems;
public class MissingNumber {
    
    static void missingNumber(int[] arr){
        var sum = 0;
        var sum2 = 0;
        var lastNumber = arr[arr.length-1];

        for(int i:arr){
            sum+=i;
        }

        sum2 = lastNumber*(lastNumber+1)/2;

        System.out.println(sum2-sum);


    }

    public static void main(String[] args) {
        missingNumber(new int[]{1,2,3,4,5,6,8,9});
    }
}

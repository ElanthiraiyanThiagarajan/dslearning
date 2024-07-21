package dspracticeproblems;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,5};
        System.out.println(missingNumberUsingXor(arr,arr.length+1));
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

    public static int missingNumberUsingForLoops(int[] numbs){
        int[] tempArray = new int[numbs.length+1];

        for(int i=0;i<numbs.length-1;i++){
            tempArray[numbs[i]]++;
        }

        for(int j=0;j<=numbs.length;j++){
            if(tempArray[j]==0){
                return j;
            }
        }

        return 0;
    }

    public static int missingNumberUsingXor(int[] numbs,int n){

        int xor1 =0,xor2=0;

        for (int i=0;i<numbs.length;i++){
            xor2^= numbs[i];
        }

        for(int i=0;i<numbs.length+1;i++){
            xor1 ^= i;
        }

        return xor1^xor2;
    }
}

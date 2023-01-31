package  dspracticeproblems;
public class SumOfDigitsUsingRecursion {
    static int sumOfDigits(int n){
        if(n<0 || n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    static int sum(int n){
        if(n<0 || n==0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }


}

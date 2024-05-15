package dspracticeproblems;

import java.util.Arrays;

public class ProductOfTheArrayExceptSelf {

    public static void main(String[] args) {
        var nums =new int[]{1,2,3,4};
        var n = nums.length;
        var ans = new int[n];
        var left=1;
        var right=1;
        Arrays.fill(ans, 1);

        for(var i=0;i<n;i++){
            ans[i]*=left;
            left*=nums[i];
        }

        for(var i=n-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}

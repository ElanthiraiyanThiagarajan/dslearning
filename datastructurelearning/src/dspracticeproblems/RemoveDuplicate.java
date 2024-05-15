package dspracticeproblems;

public class RemoveDuplicate {

    static int removeDuplicate(int[] nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }

        return j;
    }

    static int removeDuplicate2(int[] nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(j==1|| nums[i]!=nums[j-2]){
                nums[j++]=nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate2(new int[]{1,1,1,2,2,3}));
    }
}

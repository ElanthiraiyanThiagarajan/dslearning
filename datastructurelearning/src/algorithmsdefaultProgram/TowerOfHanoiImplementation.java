package algorithmsdefaultProgram;
import java.util.HashMap;
import java.util.Map;

public class TowerOfHanoiImplementation {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int n = 4; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int[] outPutArray = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i])!=null){
                outPutArray[0]= hmap.get(nums[i]);
                outPutArray[1] = i;
                break;
            }else{
                hmap.put(target-nums[i],i);
            }
        }
        return outPutArray;
    }
}

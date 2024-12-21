package dspracticeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountProgram {

    public static void main(String[] args) {
        int nums[] = {1,2,1,2,3};
        // Arrays.sort(nums);

        List<Integer> nums2 = Arrays.stream(nums).boxed().toList();

        Map<Integer,Integer> map = new HashMap<>();
        nums2.forEach(a->map.put(a, map.getOrDefault(a, 0)+1));
        System.out.println(nums2.stream()
        .sorted((a, b) -> map.get(a).equals(map.get(b)) ? b - a : map.get(a) - map.get(b))


        .collect(Collectors.toList()));

        Integer[] numsObj = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsObj[i] = nums[i];
        }

        Arrays.sort(numsObj,(a,b) -> {
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            return map.get(a) - map.get(b);
        });


    }

}

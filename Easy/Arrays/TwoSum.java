// File: Easy/Arrays/TwoSum.java

/*

 - Problem: Two Sum
 - Level: Easy
 - Source: LeetCode #1
 - Approach : Hashing (using HashMap)
 - Time : 0(n)
 - Space : 0(n)
 
 */


import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

class Solution{
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {1,4,6,2,5};
        System.out.println(Arrays.toString(Solution.twoSum(nums, 8)));
    }
}
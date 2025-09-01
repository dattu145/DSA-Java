// Majority Element in an Array could be find using three approaches,

// 1). Brute force approach - O(n^2)
// 2). Sorting and then finding the majority element - O(n log n) - more optimal than brute force.
//         Sorting : O(n log n);   loop : O(n)  =>  O(n log n) + O(n) = O(n log n);
// 3). Moore's algorithm - O(n)

// Leetcode prob : 169

import java.util.Arrays;

public class MajorityElement{

    public static int bruteforce(int[] nums){
        int freq = 0;
        for(int val : nums){
            for(int el : nums){
                if(el == val){
                    freq++;
                }
            }
            if(freq > nums.length/2){
                return val;
            }
        }
        return -1;
    }

    public static int bySorting(int[] nums){
        int freq = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                freq++;
            }
            else{
                freq = 1;
            }
            if(freq > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static int moores_algorithm(int[] nums){
        int freq = 0, ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            }
            else{ 
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,3,3,3,8,3};

        System.out.println(bruteforce(nums));
        System.out.println(bySorting(nums));
        System.out.println(moores_algorithm(nums));
    }
}
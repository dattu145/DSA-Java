// File: Easy/Arrays/RemoveDuplicatesFromSortedArrays.java

/*

 - Problem: Remove duplicates from sorted arrays
 - Level: Easy
 - Source: LeetCode #26
 - Approach : Two pointers
 - Time : 0(n)
 - Space : 0(1)
 
 // Condition : if slow != fast; slow++ and value of slow equals value of fast

 */

public class RemoveDuplicatesFromSortedArrays{
    public static int removeDuplicates(int[] nums){
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,4,5,6,6};
        System.out.println(removeDuplicates(nums));
    }
}
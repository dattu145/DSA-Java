package SlidingWindow.Arrays;

public class LongestContinuousIncreasingSubsequence{
    public static int findLengthOfLCIS(int[] nums){
        int left = 0;
        int n = nums.length;
        int maxLen = 0;

        for(int right = 1; right < n; right++){
            if(nums[right] <= nums[right-1]){
                left = right;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
package Arrays;

public class LongestSubarrayWithGivenSumK {
    public static int LongestSubarraySum(int[] nums, int k){
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum > k){
                sum -= nums[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(LongestSubarraySum(nums, k));
    }
}

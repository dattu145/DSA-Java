package Medium.SlidingWindow.Arrays;

public class LongestSubstringAfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int left = 0;
        int countZeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                countZeros++;
            }

            while (countZeros > 1) {
                if (nums[left] == 0) {
                    countZeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen - 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
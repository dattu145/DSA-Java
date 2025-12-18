package SlidingWindow.Arrays;

public class MaximumAverageSubArrayI{
    public static double MaxAvgSub(int[] nums, int k){
        
        double windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        for(int i = k; i < nums.length; i++){
            windowSum += nums[i] - nums[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(MaxAvgSub(nums, k));
    }
}


/* Approach 2 to slide a window

int left = 0;
int right = k;
double windowSum = 0;

for (int i = left; i < right; i++) {
    windowSum += nums[i];
}

double maxSum = windowSum;

while (right < nums.length) {
    windowSum -= nums[left]; 
    windowSum += nums[right];
    left++;                   
    right++;

    maxSum = Math.max(maxSum, windowSum);
}

*/
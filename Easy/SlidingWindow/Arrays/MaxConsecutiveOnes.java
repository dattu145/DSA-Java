package SlidingWindow.Arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsectiveOnes(int[] nums){
        int left = 0;
        int maxCount = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                left = right + 1;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
    public static void main(String[] args){
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsectiveOnes(nums));
    }
}

// Approach 2

/*

int count = 0;
int maxCount = 0;

for(num : nums){
    if(num == 1){
        count++;
        maxCount = Math.max(maxCount, count);
    }
    else{
        count = 0;    
    }
}

return maxCount;

*/
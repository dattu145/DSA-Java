package SlidingWindow.Arrays;
import java.util.HashSet;

public class ContainDuplicatesII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int right = 0; right < n; right++){
            if(set.contains(nums[right])){
                return true;
            }

            set.add(nums[right]);

            if(right - left >= k){
                set.remove(nums[left]);
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
}

// Rotate Right k = Rotate entire array -> Rotate first K-elements -> Rotate n - k elements

public class RotateArrayKToRight{
    public static void RotateRight(int[] nums, int k){
        int n = nums.length;

        if(n == 0) return;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n-1);
    }

    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6}; // 4,5,6,1,2,3

        // 6,5,4,3,2,1
        // 4,5,6,3,2,1
        // 4,5,6,1,2,3

        int k = 3;
        RotateRight(nums, k);

        for(int n : nums){
            System.out.println(n);
        }
    }
}
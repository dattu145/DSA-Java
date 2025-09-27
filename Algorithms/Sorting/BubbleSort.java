/*

Sorting Algorithm : Bubble Sort;
Time Complexity : O(n^2);
Space Complexity : O(1);

Advantages:
- Easy to understand & Implement
- It does not require any additional memory Space

Disadavantages:
- O(n^2) which is very slow for large datasets
- It is comparison based Sorting algorithm, Can limit the efficiency of the algorithm in certain cases.

 */


public class BubbleSort {
    public static void sort(int[] nums, int n){

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,6,2,76,4,7,1,8};
        int n = nums.length;
        sort(nums, n);

        for(int i : nums){
            System.out.println(i);
        }
    }
}

public class InsertionSort {
    public static void sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int current = nums[i];
            int j = i - 1;
            while(j >= 0 && current < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] nums = {6,3,5,1,2};
        sort(nums);

        for(int num : nums){
            System.out.println(num);
        }
    }
}

public class SelectionSort {
    public static void sort(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            int smallest = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[smallest] > nums[j]){
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] nums = {3,7,1,3,4,9,5};
        sort(nums);

        for(int n : nums){
            System.out.println(n);
        }
    }
}

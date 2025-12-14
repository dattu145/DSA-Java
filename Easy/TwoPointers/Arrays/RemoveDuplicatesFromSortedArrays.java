public class RemoveDuplicatesFromSortedArrays{
    public static int removeDuplicates(int[] nums){
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,4,5,6,6};
        System.out.println(removeDuplicates(nums));
    }
}
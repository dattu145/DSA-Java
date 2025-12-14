public class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,3,6};
        int val = 3;
        int totalElements = removeElement(nums, val);

        for(int i = 0; i < totalElements;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}

public class SingleNumber {
    public static int usingXOR(int[] nums){
        int n = nums.length;
        int xor = 0;

        for(int num : nums){
            xor ^= num;
        }

        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(usingXOR(nums));
    }
}

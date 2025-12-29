// I XOR all indices and array values. Since XOR cancels identical numbers, 
// all present values eliminate each other. The only number not canceled is the missing one.

public class MissingNumber{
    public static int usingXOR(int[] nums){
        int n = nums.length;
        int xor = 0;

        for(int i = 0; i < n; i++){
            xor ^= i;
            xor ^= nums[i];
        }

        xor ^= n;
        return xor;
    }

    public static int usingSumOfNumbersFormula(int[] nums){
        // Approach 2 : acceptable but less optimal - using sum of the numbers formula
        
        int n = nums.length;
        int excepted = n * (n+1) / 2;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        return excepted - sum;
    }
    
    public static void main(String[] args){
        int[] nums = {0,1,2,4,5};
        System.out.println(usingXOR(nums));
        System.out.println(usingSumOfNumbersFormula(nums));
    }
}

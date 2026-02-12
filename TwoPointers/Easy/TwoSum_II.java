// Arrays - TwoSum_II - Two pointers (Works only for sorted Arrays) - Easy

public class TwoSum_II{
    public static int[] twoSum(int[] arr, int target){
        int i = 0, j = arr.length-1;

        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target) return new int[]{i,j};
            else if(sum < target) i++;
            else j--;
        }

        return new int[]{};
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(arr, target);

        for(int num : result){
            System.out.print(num);
        }
    }
}
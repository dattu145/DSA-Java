/*
    Problem : Squares of a Sorted Array
    Time Complexity : O(n)
    Space Complexity : O(1)
 
 */

import java.util.Arrays;

public class SquaresOfaSortedArray {
    public static int[] squares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int pos = n - 1;
        int left = 0, right = n-1;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                result[pos] = arr[left] * arr[left];
                left++;
            }
            else{
                result[pos] = arr[right] * arr[right];
                right--;
            }
            pos--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-2,1,3,9};
        int[] result = squares(arr);

        System.out.println(Arrays.toString(result));
    }
}

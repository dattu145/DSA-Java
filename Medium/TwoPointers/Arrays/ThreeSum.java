// Arrays - 3Sum - Two pointers (Sort first then apply TwoSum) - Medium

import java.util.*;

public class ThreeSum{
    
    public static List<List<Integer>> threesum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr); //Sort the array first
        
        for(int i = 0; i < arr.length-2; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue; //Skipping i duplicates;
            
            int left = i + 1,right = arr.length-1;
            
            while(left < right){
                int sum = arr[i] + arr[right] + arr[left];
                
                if(sum == 0){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    
                    while(left < right && arr[left] == arr[left+1]) left++; // Skipping left duplicate values;
                    while(left < right && arr[right] == arr[right-1]) right--; // Skipping right duplicate values;
                    
                    left++;
                    right--;
                }
                
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
                    
            }
            
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,-1,-4};
        
        List<List<Integer>> result = threesum(arr);
        
        for(List<Integer> num : result){
            System.out.println(num);
        }
        
    }
}
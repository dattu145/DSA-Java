import java.util.*;

public class FourSum {
    public static List<List<Integer>> foursum(int[] arr, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){

            if(i > 0 && arr[i] == arr[i-1]) continue; //Skipping i duplicates

            for(int j = i + 1; j < arr.length; j++){

                if(j > i + 1 && arr[j] == arr[j-1]) continue; //Skipping j duplicates
                
                int left = j+1;
                int right = arr.length-1;

                while(left < right){
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if(sum == target){
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        while(left < right && arr[left] == arr[left+1]) left++; //Skipping left duplicates
                        while(left < right && arr[right] == arr[right-1]) right--; //Skipping right duplicates

                        left++;
                        right--;

                    }
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }

            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = foursum(arr, 2);

        for(List<Integer> num : ans){
            System.out.println(num);
        }
    }
}

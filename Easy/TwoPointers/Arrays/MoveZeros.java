// Arrays - moveZeros -Two Pointers - Easy

// Slow & fast starts from index 0
// Condition : if fast != 0, swap with slow and increment slow

public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int slow = 0;

        for(int fast = 0; fast < arr.length; fast++){
            if(arr[fast] != 0){
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;

                slow++;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr= {0,1,0,3,12};
        moveZeros(arr);

        for(int num : arr){
            System.out.println(num);
        }
    }
}

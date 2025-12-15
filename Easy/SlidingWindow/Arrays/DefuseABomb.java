package SlidingWindow.Arrays;
import java.util.Arrays;

public class DefuseABomb {
    public static int[] decrypt(int[] code, int k){
        int windowSize = Math.abs(k);
        int n = code.length;
        int[] result = new int[n];
        int sum = 0;

        int start, end;

        if(k == 0) return result;

        if(k > 0){
            start = 1;
            end = windowSize;
        }
        else{
            start = n - windowSize;
            end = n - 1;
        }

        for(int i = start; i <= end; i++){
            sum += code[i % n];
        }

        for(int i = 0; i < n; i++){
            result[i] = sum;

            sum -= code[start % n];
            start++;

            end++;
            sum += code[end % n];
        }

        return result;
    }
    public static void main(String[] args){
        int[] code = {2,4,9,3};
        int k = -2;

        int[] result = decrypt(code, k);

        System.out.println(Arrays.toString(result));
    }
}

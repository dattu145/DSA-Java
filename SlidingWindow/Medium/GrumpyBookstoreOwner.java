package Medium.SlidingWindow.Arrays;

public class GrumpyBookstoreOwner {
    public static int MostSatisfied(int[] customers, int[] grumpy, int minutes){
        int n = customers.length;
        int baseLineSum = 0;
        int maxExtra = 0;
        int ExtraGain = 0;
        int windowSize = minutes;

        int left = 0, right = windowSize;

        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0){
                baseLineSum += customers[i];
            }
        }

        for(int i = left; i < right; i++){
            if(grumpy[i] == 1){
                ExtraGain += customers[i];
            }
        }

        maxExtra = ExtraGain;

        while(right < n){
            if(grumpy[left] == 1){
                ExtraGain -= customers[left];
            }
            if(grumpy[right] == 1){
                ExtraGain += customers[right];
            }

            left++;
            right++;
            maxExtra = Math.max(maxExtra, ExtraGain);
        }
        

        return baseLineSum + maxExtra;
    }
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;

        System.out.println(MostSatisfied(customers, grumpy, minutes));
    }
}

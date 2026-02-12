package Medium.SlidingWindow.Arrays;

public class SubarraysAverageGreaterOrEqualToThreshold {
    public static int noOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = k;
        int count = 0;
        int sum = 0;

        for (int i = left; i < right; i++) {
            sum += arr[i];
        }

        if (sum >= threshold * k) {
            count++;
        }

        while(right < arr.length) {
            sum += arr[right];
            sum -= arr[left];

            right++;
            left++;

            if (sum >= threshold * k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k = 3;
        int threshold = 4;

        System.out.println(noOfSubarrays(arr, k, threshold));
    }
}
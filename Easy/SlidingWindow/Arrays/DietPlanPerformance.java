package SlidingWindow.Arrays;

public class DietPlanPerformance {

    public static int DietScore(int[] calories, int k, int lower, int upper) {
        int n = calories.length;
        int left = 0, right = k;
        int windowSum = 0;
        int score = 0;

        for (int i = left; i < right; i++) {
            windowSum += calories[i];
        }

        if (windowSum > upper) score++;
        else if (windowSum < lower) score--;

        for (int i = k; i < n; i++) {
            windowSum -= calories[left];
            windowSum += calories[right];

            left++;
            right++;

            if (windowSum > upper) score++;
            else if (windowSum < lower) score--;
        }

        return score;
    }

    public static void main(String[] args) {
        int[] calories = {6,5,0,0};
        int k = 2;
        int lower = 1;
        int upper = 5;

        System.out.println(DietScore(calories, k, lower, upper));
    }
}

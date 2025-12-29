package Medium.TwoPointers.Arrays;

import java.util.ArrayList;

public class UnionTwoSortedArrays {
    // Approach 3 - O(n+m) Time & O(n) Space

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {

            // Skip duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                result.add(arr2[j]);
                j++;
            } else { // equal
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Remaining elements of arr2
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        System.out.println(findUnion(arr1, arr2));
    }
}
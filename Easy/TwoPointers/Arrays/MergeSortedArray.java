public class MergeSortedArray {
    public static int[] mergeArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        while(j >= 0){
            arr1[k--] = arr2[j--];
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 4, 5, 8 };
        int m = 3;
        int n = 3;
        int[] result = mergeArray(arr1, m, arr2, n);

        for(int num : result){
            System.out.print(num + "  ");
        }
    }
}

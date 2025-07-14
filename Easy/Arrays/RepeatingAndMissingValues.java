import java.util.HashSet;

public class RepeatingAndMissingValues {

    public static int[] solution(int[][] grid) {
        HashSet<Integer> seen = new HashSet<>();
        int n = grid.length;

        int repeated = -1;
        // First pass – find the repeated number
        for (int[] row : grid) {
            for (int val : row) {
                if (!seen.add(val)) {        // add() returns false if val already present
                    repeated = val;
                }
            }
        }

        // Second pass – find the missing number (range is 1..4)
        int missing = -1;
        for (int num = 1; num <= n * n; num++) {
            if (!seen.contains(num)) {
                missing = num;
                break;
            }
        }

        return new int[] { repeated, missing };
    }

    public static void main(String[] args) {
        int[][] grid = { {1, 2}, {2, 4} };
        int[] res = solution(grid);
        System.out.println("Repeated = " + res[0] + ", Missing = " + res[1]);
    }
}
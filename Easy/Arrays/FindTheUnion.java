import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;

public class FindTheUnion {

    public static ArrayList<Integer> findUnionUsingTreeMap(int[] arr1, int[] arr2){
        // Approach 1 : Using TreeMap - (O((n+m) log(n+m)) Time & O(n+m) Space)
    
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr2){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> finalarr = new ArrayList<>();

        for(int key : map.keySet()){
            finalarr.add(key);
        }

        return finalarr;

    }

    public static ArrayList<Integer> findUnionUsingSet(int[] arr1, int[] arr2){
        // Approach 2 : Using a Set (TreeSet) - O(n+m) Time & O(n+m) Space

        TreeSet<Integer> set = new TreeSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        return new ArrayList<>(set);

        // Most Optimal: Approach 3 - Find the Union using Two pointers (O(n+m) time & O(1) space)
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        ArrayList<Integer> result = findUnionUsingTreeMap(arr1, arr2);

        for(int i : result){
            System.out.println(i);
        }
    }
}

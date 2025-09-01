package Medium.Arrays;
import java.util.*;

public class RomanToInteger {
    static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
	    map.put('I', 1);
	    map.put('V', 5);
	    map.put('X', 10);
	    map.put('L', 50);
	    map.put('C', 100);
	    map.put('D', 500);
	    map.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length()-1; i++){
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if(current < next){
                total -= current;
            }
            else{
                total += current;
            }
        }
        total += map.get(s.charAt(s.length() - 1));

        return total;
    }

    public static void main(String[] args){
        String s1 = "III";
		String s2 = "LVIII";
		String s3 = "MCMXCIV";

		System.out.println(s1 + " = " + romanToInt(s1)); // Output: 3
		System.out.println(s2 + " = " + romanToInt(s2)); // Output: 58
		System.out.println(s3 + " = " + romanToInt(s3)); // Output: 1994
    }
}

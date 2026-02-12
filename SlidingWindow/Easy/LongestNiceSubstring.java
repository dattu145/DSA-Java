package SlidingWindow.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static String niceSubstring(String s) {

        if (s.length() < 2) return "";

        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!set.contains(swapCase(c))){
                String left = niceSubstring(s.substring(0,i));
                String right = niceSubstring(s.substring(i+1));
                return left.length() >= right.length() ? left : right;
            }
        }

        return s;
    }

    public static char swapCase(char c){
        if(Character.isUpperCase(c)){
            return Character.toLowerCase(c);
        }
        else{
            return Character.toUpperCase(c);
        }
    }

    public static void main(String[] args) {
        System.out.println(niceSubstring("YazaAay"));
    }
}

/*
Notes:

- Uses Divide & Conquer.
- We use Recursion in this Problem.
- The problematic character(char whose swapcase is not present in the set) is skipping and recursed;

*/
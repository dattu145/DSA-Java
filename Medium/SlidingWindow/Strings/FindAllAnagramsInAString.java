import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        int[] freqP = new int[26];
        int[] freqS = new int[26];

        if(s.length() < p.length()) return new ArrayList<>();

        for(int i = 0; i < p.length(); i++){
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }

        List<Integer> result = new ArrayList<>();

        if(matches(freqS, freqP)){
            result.add(0);
        }

        for(int i = p.length(); i < s.length(); i++){
            freqS[s.charAt(i) - 'a']++;

            freqS[s.charAt(i - p.length()) - 'a']--;

            if(matches(freqP, freqS)){
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }


    public static boolean matches(int[] freq1,int[] freq2){
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAnagrams(s,p);

        System.out.println(ans);
    }
}
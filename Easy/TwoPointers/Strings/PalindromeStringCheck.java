// String palindrome - Two Pointers

public class PalindromeStringCheck{
    public static boolean Palindrome(String str){
        int left = 0, right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "MALAYALAM";
        System.out.println(Palindrome(str));
    }
}
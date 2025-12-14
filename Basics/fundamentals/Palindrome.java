class usingPackages{
    public static boolean isPalindromeString(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}

class Palindromes{
    public static boolean isPalindromeNumber(int num){
        if (num < 0) return false;
        int original = num, reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static boolean isPalindromeTwoPointer(String s){
        int left = 0, right = s.length() -1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
}

public class Palindrome{
    public static void main(String[] args){
        System.out.println(Palindromes.isPalindromeTwoPointer("MALAYALAM"));
    }
}
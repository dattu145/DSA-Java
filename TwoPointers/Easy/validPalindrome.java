public class validPalindrome{
    public static boolean Palindrome(String str){
        int left = 0, right = str.length()-1;
        String s = str.toLowerCase();
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "ama, MaLAYALAM ,ama";
        System.out.println(Palindrome(str));
    }
}
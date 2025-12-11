public class ReverseAString{
    public static String reverse(String name){
        char[] arr = name.toCharArray();
        int left = 0, right= name.length()-1;

        while(left <= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String name = "Dattu";
        String reversed = reverse(name);
        System.out.println(reversed);
    }
}
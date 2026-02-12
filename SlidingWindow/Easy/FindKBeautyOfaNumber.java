package SlidingWindow.Strings;

public interface FindKBeautyOfaNumber {
    public static int divisorSubstrings(int num, int k) {
        String numStr = String.valueOf(num); // converts int to str, could also use Integer.toString();
        int count = 0;

        for(int i = 0; i <= numStr.length() - k; i++){
            String substr = numStr.substring(i, i + k);

            int val = Integer.parseInt(substr);

            if(val != 0 && num % val == 0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int num = 240;
        int k =2;
        System.out.println(divisorSubstrings(num, k));
    }
}

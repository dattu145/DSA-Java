public class decimalToBinary {
    public static int decToBin(int decNum){
        int ans = 0;
        int pow = 1;

        while(decNum > 0){
            int rem = decNum % 2;
            ans += (rem * pow);
            decNum /= 2;
            pow *= 10;
        }

        return 0;
    }
    public static void main(String[] args){
        System.out.println(decToBin(13));
    }
}

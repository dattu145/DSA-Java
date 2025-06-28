public class binaryToDecimal {
    public int binToDes(int binNum){
        int ans = 0;
        int pow = 1;
        while(binNum > 0){
            int rem = binNum % 10;
            ans += (rem * pow);
            binNum /= 10;
            pow *= 2;
        }
        return ans;
    }
    public static void main(String[] args){
        binaryToDecimal soln = new binaryToDecimal();
        System.out.println(soln.binToDes(1101));
    }
}

// 1234 % 10 ->	4 (Last digit of the number)
// 1234 / 10 ->	123 (Number without the last digit)
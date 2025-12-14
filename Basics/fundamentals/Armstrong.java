public class Armstrong {
    
    static boolean solution1(int num){  // with Math
        int original = num;
        int sum = 0;

        int n = String.valueOf(num).length();

        while(num > 0){
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, n);
            num /= 10;
        }

        return sum == original;
    }


    static boolean solution2(int num){ // without Math (more optimized)
        int original = num;
        int sum = 0;
        int n = String.valueOf(num).length();

        while(num > 0){
            int digit = num % 10;
            int power = 1;
            for(int i = 0; i < n; i++) power *= digit;
            sum += power;
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args){
        System.out.println(solution1(153));
        System.out.println(solution2(133));
    }
}

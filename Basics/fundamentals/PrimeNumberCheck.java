public class PrimeNumberCheck {

    static boolean isPrimeBasic(int num){
        if(num <= 1) return false;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeSqrt(int num){
        if(num <= 1) return false;

        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeSkipEven(int num){ // Interview Ready
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; i * i <= num; i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int num = 17;
        System.out.println(isPrimeBasic(num));
        System.out.println(isPrimeSqrt(num));
        System.out.println(isPrimeSkipEven(num));
    }
}

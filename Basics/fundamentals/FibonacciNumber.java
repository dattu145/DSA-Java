public class FibonacciNumber {

    // F(n)=F(n−1)+F(n−2),  F(0)=0,F(1)=1

    static void fibonacciIterative(int n){
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    static int fibonacciNthIterative(int n){
        int a = 0, b = 1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String[] args){
        fibonacciIterative(10);
        System.out.println(fibonacciNthIterative(10));
    }
}

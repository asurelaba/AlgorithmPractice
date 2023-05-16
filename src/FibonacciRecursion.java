//Java program to find the Nth term in a Fibonacci series using recursion

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    private static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

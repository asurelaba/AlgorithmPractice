//Java program to find the factorial of a number using recursion
public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}

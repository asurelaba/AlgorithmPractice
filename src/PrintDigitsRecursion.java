//Java program to print the numbers from a given number n till 0 using recursion
public class PrintDigitsRecursion {
    public static void main(String[] args) {
        print(1234);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n%10);
        print(n/10);
    }
}

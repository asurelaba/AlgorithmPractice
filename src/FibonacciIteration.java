//Java program to print Fibonacci series using iteration

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth fib index ");
        int n = scanner.nextInt();
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        System.out.print (fib.get(0) + " ");
        System.out.print (fib.get(1) + " ");
        for (int i = 2 ; i <= n ; i++){
            fib.add(fib.get(i-1)+ fib.get(i-2));
            System.out.print (fib.get(i) + " ");
        }
        System.out.println("nth fib number is :: " + fib.get(n));
    }
}

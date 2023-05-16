import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenFibSum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 450;
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        int i = 1;
        while (fib.get(i) <= n) {
            i++;
            if (fib.get(i - 1) + fib.get(i - 2) > n) {
                break;
            }
            fib.add(fib.get(i - 1) + fib.get(i - 2));
            System.out.print(fib.get(i) + " ");
            if (fib.get(i) % 2 == 0) {
                sum += fib.get(i);
            }
        }
        System.out.println(sum);
    }
}

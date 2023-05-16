import java.util.Scanner;

public class RealNumbersProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input;
        double product = 1;
        do {
            System.out.println("Enter real number:: ");
            input = scanner.nextDouble();
            product *= input;
            System.out.println("Enter c to continue");
        } while (scanner.next().equals("c"));
        System.out.println("Product:: " + product);
    }
}

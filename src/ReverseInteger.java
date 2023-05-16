//Java program to display the given integer in the reverse order
public class ReverseInteger {
    public static void main(String[] args) {
        int value = 1234678;
        int reverse = 0;
        while (value != 0) {
            System.out.println(value % 10);
            reverse = reverse * 10 + value % 10;
            value /= 10;
        }
        System.out.println(reverse);
    }
}

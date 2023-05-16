//Java program to find the sum of the digits of an integer using a while loop

public class SumDigits {
    public static void main(String[] args) {
        int value = 1234;
        int sum = 0;
        while(value != 0){
            System.out.println(value%10);
            sum += value%10;
            value /= 10;
        }
        System.out.println("SUm::" + sum);
    }
}

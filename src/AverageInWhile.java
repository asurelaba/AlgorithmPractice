//Java program to find the average of 5 numbers using a while loop
public class AverageInWhile {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 6};
        int i = 0;
        double sum = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("Average::" + sum / arr.length);
    }
}

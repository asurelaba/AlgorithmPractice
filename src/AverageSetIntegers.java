import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Java program to find out the average of a set of integers
public class AverageSetIntegers {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        System.out.println("Average :: " + integerSet.stream().mapToDouble(Integer::intValue).average().getAsDouble());

    }
}

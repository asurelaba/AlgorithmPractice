import java.security.cert.CollectionCertStoreParameters;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomEvenOdd {
    public static void main(String[] args) {
        Random random = new Random(896475843);
        random.ints(20).filter((a) -> a % 2 == 0).forEach(System.out::println);
    }
}

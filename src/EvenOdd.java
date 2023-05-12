import java.util.concurrent.ScheduledExecutorService;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(check(9));
    }

    public static boolean check(int num){
        return num%2 == 0 ? true:false;
    }
}

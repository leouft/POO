import java.time.LocalTime;
import java.time.Instant;

public class Main {
    public static void main() throws InterruptedException {
        System.out.println("Hora atual: " + LocalTime.now());
        System.out.println("Unix epoch time: " + Instant.now().getEpochSecond());
        Thread.sleep(1000);
        System.out.println("Unix epoch time: " + Instant.now().getEpochSecond());
    }
}
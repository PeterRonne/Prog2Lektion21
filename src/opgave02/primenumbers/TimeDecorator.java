package opgave02.primenumbers;

import java.time.Duration;
import java.time.Instant;

public class TimeDecorator extends PrimeDecorator{
    public TimeDecorator(Prime prime) {
        super(prime);
    }

    @Override
    public void findPrimeNumbers(int n) {
        Instant start = Instant.now();

        prime.findPrimeNumbers(n);

        System.out.println();
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() + " ms.");
    }
}

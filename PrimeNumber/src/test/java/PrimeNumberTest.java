import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test public void identifiesPrimeNumber() { assertTrue(new PrimeNumber().isPrime(17)); }
    @Test public void identifiesCompositeNumber() { assertFalse(new PrimeNumber().isPrime(12)); }
    @Test public void numbersBelowTwoAreNotPrime() { assertFalse(new PrimeNumber().isPrime(1)); }
}

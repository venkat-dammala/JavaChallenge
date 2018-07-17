import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vens.start.Fibonacci;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FibonacciTest {


  @Test
  @DisplayName("test logic with number 3")
  public void testWith3() {
    Fibonacci fb = new Fibonacci();
    BigInteger expected = BigInteger.valueOf(2);
    BigInteger actual = fb.start(BigInteger.valueOf(3));
    assertEquals(expected, actual);

  }

  @Test
  @DisplayName("test logic with number 2")
  public void testWith2() {
    Fibonacci fb = new Fibonacci();
    BigInteger expected = BigInteger.valueOf(1);
    BigInteger actual = fb.start(BigInteger.valueOf(2));
    assertEquals(expected, actual);

  }

  @Test
  @DisplayName("test logic with number 25")
  public void testWith25() {
    Fibonacci fb = new Fibonacci();
    BigInteger expected = BigInteger.valueOf(75025);
    BigInteger actual = fb.start(BigInteger.valueOf(25));
    assertEquals(expected, actual);

  }

}

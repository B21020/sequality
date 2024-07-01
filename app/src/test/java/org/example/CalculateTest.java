package test.java.org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate Calculate = new Calculate();
            int expected = 5;
            assertEquals(expected, Calculate.sum(2, 3));
     }
}
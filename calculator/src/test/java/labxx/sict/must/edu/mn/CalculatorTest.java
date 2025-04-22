package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 = 5");
    }

    @Test
    void testSubtract() {
        assertEquals(-1.0, calc.subtract(2.0, 3.0), "2 - 3 = -1");
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 = 6");
    }

    @Test
    void testDivideNormal() {
        assertEquals(2.0, calc.divide(6.0, 3.0), "6 / 3 = 2");
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1.0, 0.0),
                     "Хуваалт нь IllegalArgumentException өгнө");
    }
}

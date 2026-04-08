import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddition() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    public void testAdditionDifferentValues() {
        assertEquals(7, calc.add(3,4));
    }

    @Test
    public void testAdditionNegative() {
        assertEquals(-2, calc.add(-1,-1));
    }
}

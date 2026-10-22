import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTesting {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;
        int actual = calculator.add(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 3;
        int actual = calculator.subtract(4, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 3;
        int actual = calculator.multiply(1, 3);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivide() {
        int expected = 4;
        int actual = calculator.divide(4, 1);
        assertEquals(expected, actual);
    }
}

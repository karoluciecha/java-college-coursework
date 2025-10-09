package test;

import main.ClassThree;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestThree {

    ClassThree calc;

    @BeforeEach
    void setUp() {
        // Example: test object initialized for (9, 3)
        calc = new ClassThree(9, 3);
    }

    @Test
    void testDivide() {
        assertEquals(3.0f, calc.divide(), 0.0001, "9 divided by 3 should be 3");
    }

    @Test
    void testDivideByZeroThrows() {
        calc = new ClassThree(5, 0);
        Exception exception = assertThrows(IllegalArgumentException.class, calc::divide);
        assertEquals("Divide by Zero error", exception.getMessage());
    }

    @Test
    void testSquareRoot() {
        // Set up for positive value
        calc = new ClassThree(16, 2);
        assertEquals(4.0f, calc.square_root(), 0.0001, "Square root of 16 should be 4");
    }

    @Test
    void testSquareRootNegativeThrows() {
        calc = new ClassThree(-4, 2);
        Exception exception = assertThrows(IllegalArgumentException.class, calc::square_root);
        assertEquals("Square Root of negative num not possible", exception.getMessage());
    }
}
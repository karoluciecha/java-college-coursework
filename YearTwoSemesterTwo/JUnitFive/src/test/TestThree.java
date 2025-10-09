package test;

import main.ClassThree;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestThree {

    ClassThree calc;

    @BeforeEach
    void setUp() {
        // Default initialization for basic tests
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
        calc = new ClassThree(16, 2);
        assertEquals(4.0f, calc.squareRoot(), 0.0001, "Square root of 16 should be 4");
    }

    @Test
    void testSquareRootNegativeThrows() {
        calc = new ClassThree(-4, 2);
        Exception exception = assertThrows(IllegalArgumentException.class, calc::squareRoot);
        assertEquals("Square Root of negative num not possible", exception.getMessage());
    }

    // Parameterized test integrated from TestEight
    @ParameterizedTest
    @CsvSource({
        "9, 1, 9, 3",
        "-36, 2, -18, null",
        "0, 10, 0, 0",
        "25, 0, null, 5"
    })
    void testDivideAndRoot(float a, float b, String expectedDivideStr, String expectedRootStr) {
        ClassThree mathsFunctions = new ClassThree(a, b);

        Float expectedDivide = "null".equals(expectedDivideStr) ? null : Float.valueOf(expectedDivideStr);
        Float expectedRoot = "null".equals(expectedRootStr) ? null : Float.valueOf(expectedRootStr);

        // test divide()
        try {
            float divideResult = mathsFunctions.divide();
            assertNotNull(expectedDivide, "Expected exception but got divide result");
            assertEquals(expectedDivide, divideResult, 0.0001);
        } catch (IllegalArgumentException e) {
            assertNull(expectedDivide, "Expected divide result but got exception");
        }

        // test squareRoot()
        try {
            float rootResult = mathsFunctions.squareRoot();
            assertNotNull(expectedRoot, "Expected exception but got root result");
            assertEquals(expectedRoot, rootResult, 0.0001);
        } catch (IllegalArgumentException e) {
            assertNull(expectedRoot, "Expected root result but got exception");
        }
    }
}

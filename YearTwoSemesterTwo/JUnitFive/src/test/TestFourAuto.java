package test;

import main.ClassFour;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestFourAuto {

    ClassFour matrix1;
    ClassFour matrix2;

    @BeforeEach
    void setUp() {
        matrix1 = new ClassFour(1); // Fill with 1s (if constructor allows)
        matrix2 = new ClassFour(2); // Fill with 2s (if constructor allows)
        // If needed, manually set individual elements here
    }

    @Test
    void testAdd() {
        ClassFour expected = new ClassFour(3); // Expected: all elements 3
        ClassFour result = matrix1.Add(matrix2);
        assertTrue(expected.equals(result), "Matrix addition should produce correct results");
    }

    @Test
    void testSubtract() {
        ClassFour expected = new ClassFour(-1); // Expected: all elements -1
        ClassFour result = matrix1.Subtract(matrix2);
        assertTrue(expected.equals(result), "Matrix subtraction should produce correct results");
    }

    @Test
    void testEquality() {
        ClassFour copy = new ClassFour(1);
        assertTrue(matrix1.equals(copy), "Copy should be equal to original");
        copy.getMatrix()[0][0] = 99;
        assertFalse(matrix1.equals(copy), "Modified copy should not be equal");
    }
}

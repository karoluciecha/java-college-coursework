package test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.ClassOne;

import org.junit.jupiter.api.Assertions;

class TestOne {

    @BeforeAll
    static void testSetup() {
        // Setup code before all tests
    }

    @AfterAll
    static void testCleanup() {
        // Teardown for data used by the unit tests
    }

    @Test
    void testExceptionIsThrown() {
        ClassOne tester = new ClassOne();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tester.multiply(1000, 5);
        });
    }

    @Test
    void testMultiply() {
        ClassOne tester = new ClassOne();
        Assertions.assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
    }
}
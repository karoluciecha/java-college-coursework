package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.ClassSeven;

public class TestSeven {

    private final ClassSeven oddCheck = new ClassSeven();

    @ParameterizedTest
    @CsvSource({
        "1, true",
        "2, false",
        "13, true",
        "44, false",
        "99, true"
    })
    public void testOddCheck(int input, boolean expected) {
        assertEquals(expected, oddCheck.validate(input),
            "Failed on input: " + input);
    }
}

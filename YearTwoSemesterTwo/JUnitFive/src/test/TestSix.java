package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.ClassSix;

public class TestSix {

    @ParameterizedTest
    @CsvSource({
        "testuser1, pass1, 7897",
        "testuser2, pass2, 7898",
        "testuser3, pass3, 7899"
    })
    public void testRegister(String username, String password, int pin) {
        System.out.println("Testing Registration:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("PIN: " + pin);
        System.out.println("--------------------\n");

        ClassSix user = new ClassSix(username, password, pin);
        assertTrue(user.register(), "User registration should succeed");
    }
}

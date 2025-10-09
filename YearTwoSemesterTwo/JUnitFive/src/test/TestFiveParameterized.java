package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import main.ClassFive;

public class TestFiveParameterized {

    private ClassFive account;

    @BeforeEach
    void setUp() {
        // initialization will be done in the test method as needed
    }

    @ParameterizedTest
    @CsvSource({
        "100.0, 2, 120, 20, 204.0",
        "200.0, 2, 120, 20, 306.0"
    })
    void testAccountOperations(double initialBalance, int interestRate, float lodgement, float withdrawal, double expectedBalanceAfterAllOps) {
        account = new ClassFive(initialBalance, 123, interestRate);
        account.makeLodgement(lodgement);
        account.makeWithdrawal(withdrawal);
        account.addInterest();
        assertEquals(expectedBalanceAfterAllOps, account.getBalance(), 0.001);
    }
}
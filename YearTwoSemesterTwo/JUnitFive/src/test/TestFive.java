package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.ClassFive;

public class TestFive {
    private ClassFive account;

    @BeforeEach
    public void setUp() {
        // Initial balance 1000, interest rate 2, accNumber can be any number e.g. 123
        account = new ClassFive(1000, 123, 2);
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testMakeLodgement() {
        double newBalance = account.makeLodgement(20f);
        assertEquals(1020.0, newBalance, 0.001);
    }

    @Test
    public void testMakeWithdrawal() {
        double newBalance = account.makeWithdrawal(40f);
        assertEquals(960.0, newBalance, 0.001);
    }

    @Test
    public void testAddInterest() {
        account.addInterest();
        assertEquals(1020.0, account.getBalance(), 0.001);
    }
}
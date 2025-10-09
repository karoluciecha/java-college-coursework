package test;

import main.ClassTwo;
import org.junit.jupiter.api.*;

class TestTwo {

    static ClassTwo classTwo;

    @BeforeAll
    static void setupAll() {
        System.out.println("Beginning");
        classTwo = new ClassTwo();
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ending");
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Open Browser");
        // Additional setup per test if needed
    }

    @AfterEach
    void tearDownEach() {
        System.out.println("Close Browser");
        // Additional teardown per test if needed
    }

    @Test
    void loginTest() {
    	classTwo.login();
    }

    @Test
    @Disabled("Register user test ignored")
    void registerUserTest() {
    	classTwo.registerUser();
    }

    @Test
    void databaseTest() {
    	classTwo.databaseOperation();
    }

    @Test
    void sendingEmailTest() {
    	classTwo.sendEmail();
    }

    @Test
    void sendingMessageTest() {
    	classTwo.sendMessage();
    }
}
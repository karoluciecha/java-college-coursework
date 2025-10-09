package main;

public class ClassSix {
    private String username;
    private String password;
    private int pin;

    public ClassSix(String username, String password, int pin) {
        this.username = username;
        this.password = password;
        this.pin = pin;
    }

    public boolean register() {
        // Example registration logic; replace with actual
        return username != null && !username.isEmpty()
            && password != null && !password.isEmpty()
            && pin > 0;
    }
}

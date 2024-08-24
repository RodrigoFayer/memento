package org.example;

public class UserStateLegacy extends UserState {
    private UserStateLegacy() {};
    private static UserStateLegacy instance = new UserStateLegacy();
    public static UserStateLegacy getInstance() {
        return instance;
    }

    public String getState() {
        return "Legacy";
    }
}

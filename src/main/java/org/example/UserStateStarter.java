package org.example;

public class UserStateStarter extends UserState {
    private UserStateStarter() {};
    private static UserStateStarter instance = new UserStateStarter();
    public static UserStateStarter getInstance() {
        return instance;
    }

    public String getState() {
        return "Starter";
    }

    public boolean canSwapToPro() {
        return true;
    }

    public boolean canSwapToPremium() {
        return true;
    }
}

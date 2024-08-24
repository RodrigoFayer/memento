package org.example;

public class UserStatePro extends UserState {
    private UserStatePro() {};
    private static UserStatePro instance = new UserStatePro();
    public static UserStatePro getInstance() {
        return instance;
    }

    public String getState() {
        return "Pro";
    }

    public boolean canSwapToStarter() {
        return true;
    }

    public boolean canSwapToPremium() {
        return true;
    }
}

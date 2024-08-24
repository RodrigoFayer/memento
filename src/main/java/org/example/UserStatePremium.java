package org.example;

public class UserStatePremium extends UserState {
    private UserStatePremium() {};
    private static UserStatePremium instance = new UserStatePremium();
    public static UserStatePremium getInstance() {
        return instance;
    }

    public String getState() {
        return "Premium";
    }

    public boolean canSwapToStarter() {
        return true;
    }

    public boolean canSwapToPro() {
        return true;
    }

}

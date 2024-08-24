package org.example;

public class UserStateEnterprise extends UserState {
    private UserStateEnterprise() {};
    private static UserStateEnterprise instance = new UserStateEnterprise();
    public static UserStateEnterprise getInstance() {
        return instance;
    }

    public String getState() {
        return "Enterprise";
    }

    @Override
    public boolean canSwapToLegacy() {
        return true;
    }
}

package org.example;

public abstract class UserState {
    public abstract String getState();

    public boolean canSwapToLegacy() {
        return false;
    }

    public boolean canSwapToStarter() {
        return false;
    }

    public boolean canSwapToPro() {
        return false;
    }

    public boolean canSwapToPremium() {
        return false;
    }

    public boolean canSwapToEnterprise() {
        return false;
    }
}

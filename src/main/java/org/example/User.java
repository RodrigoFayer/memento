package org.example;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String name;
    private UserState state;
    private List<UserState> memento = new ArrayList<>();

    public User() {
        this.state =  UserStateStarter.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
        this.memento.add(state);
    }

    public void restoreState(int index) {
        if (index < 0 || index >= this.memento.size()) {
            throw new IllegalArgumentException("Invalid index");
        }

        this.state = this.memento.get(index);
    }

    public List<UserState> getStates() {
        return this.memento;
    }

    public String getStateName() {
        return this.state.getState();
    }

    public boolean canSwapToLegacy() {
        return this.state.canSwapToLegacy();
    }

    public boolean canSwapToStarter() {
        return this.state.canSwapToStarter();
    }

    public boolean canSwapToPro() {
        return this.state.canSwapToPro();
    }

    public boolean canSwapToPremium() {
        return this.state.canSwapToPremium();
    }

    public boolean canSwapToEnterprise() {
        return this.state.canSwapToEnterprise();
    }
}

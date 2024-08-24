package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void shouldStoreState() {
        User user = new User();
        user.setState(UserStateStarter.getInstance());
        user.setState(UserStatePro.getInstance());
        assertEquals(2, user.getStates().size());
    }

    @Test
    void shouldRestoreToInitialState() {
        User user = new User();
        user.setState(UserStateStarter.getInstance());
        user.setState(UserStatePro.getInstance());
        user.restoreState(0);
        assertEquals(UserStateStarter.getInstance(), user.getState());
    }

    @Test
    void shouldRestoreToPreviousState() {
        User user = new User();
        user.setState(UserStateStarter.getInstance());
        user.setState(UserStatePro.getInstance());
        user.setState(UserStateEnterprise.getInstance());
        user.restoreState(1);
        assertEquals(UserStatePro.getInstance(), user.getState());
    }

    @Test
    void shouldThrowExceptionWhenRestoringInvalidState() {
        User user = new User();
        user.setState(UserStateStarter.getInstance());
        user.setState(UserStatePro.getInstance());
        try {
            user.restoreState(2);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }
}
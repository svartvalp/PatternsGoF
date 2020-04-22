package com.kasyan313.Patterns.Behavioral.State;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }
    public void changeState(State newState) {
        state = newState;
    }

    public void doThis() {
        state.doThis();
    }
    public void doThat() {
        state.doThat();
    }
}

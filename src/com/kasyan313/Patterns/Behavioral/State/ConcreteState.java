package com.kasyan313.Patterns.Behavioral.State;

public class ConcreteState implements State {
    Context context;

    public ConcreteState(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        //do this
    }

    @Override
    public void doThat() {
        //do that
    }
}

package com.kasyan313.Patterns.Behavioral.Mediator;

public class ClassC {
    Mediator mediator;
    public void doSomeStuff() {
        //logic
        mediator.notify(this);
    }
}

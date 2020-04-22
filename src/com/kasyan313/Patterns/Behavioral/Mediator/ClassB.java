package com.kasyan313.Patterns.Behavioral.Mediator;

public class ClassB {
    Mediator mediator;
    public void doSomeStuff() {
        //logic
        mediator.notify(this);
    }
}

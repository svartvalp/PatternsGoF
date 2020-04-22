package com.kasyan313.Patterns.Behavioral.Mediator;

public class ClassD {
    Mediator mediator;
    public void doSomeStuff() {
        //logic
        mediator.notify(this);
    }
}

package com.kasyan313.Patterns.Behavioral.Mediator;

public class ClassA {
    Mediator mediator;
    public void doSomeStuff() {
        //logic
        mediator.notify(this);
    }
}

package com.kasyan313.Patterns.Structural.Adapter;


public class Adapter implements SomeInterface {
    Service adaptee;
    @Override
    public void method() {
        //do some logic
        adaptee.serviceMethod();

    }
}

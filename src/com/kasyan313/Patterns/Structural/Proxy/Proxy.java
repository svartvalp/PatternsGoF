package com.kasyan313.Patterns.Structural.Proxy;

public class Proxy implements SomeInterface {
    SomeClass someClass;

    public Proxy() {

    }

    //control the lifecycle of someClass
    @Override
    public void operation() {
        if(someClass == null) {
            someClass = new SomeClass();
        }
        someClass.operation();
        someClass = null;
    }
}

package com.kasyan313.Patterns.Behavioral.Mediator;

public class ConcreteMediator implements Mediator {

    @Override
    public void notify(Object sender) {
        if(sender instanceof ClassA) {
            //do some stuff or/and notify some another object
        }
        if(sender instanceof ClassB) {
            //do some stuff or/and notify some another object
        }
        if(sender instanceof ClassC) {
            //do some stuff or/and notify some another object
        }
        if(sender instanceof ClassD) {
            //do some stuff or/and notify some another object
        }
    }
}

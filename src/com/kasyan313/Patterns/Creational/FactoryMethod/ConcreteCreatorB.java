package com.kasyan313.Patterns.Creational.FactoryMethod;

public class ConcreteCreatorB extends Creator {
    @Override
    SomeInterface createClass() {
        return new ConcreteClassB();
    }
}

package com.kasyan313.Patterns.Creational.FactoryMethod;

public class ConcreteCreatorA extends Creator {
    @Override
    SomeInterface createClass() {
        return new ConcreteClassA();
    }
}

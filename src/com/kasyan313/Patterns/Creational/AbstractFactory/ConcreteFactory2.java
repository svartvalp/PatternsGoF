package com.kasyan313.Patterns.Creational.AbstractFactory;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    ClassA createClassA() {
        return new ConcreteClassA2();
    }

    @Override
    ClassB createCLassB() {
        return new ConcreteClassB2();
    }
}

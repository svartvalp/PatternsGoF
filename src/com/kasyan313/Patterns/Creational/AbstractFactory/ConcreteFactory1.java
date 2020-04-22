package com.kasyan313.Patterns.Creational.AbstractFactory;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    ClassA createClassA() {
        return new ConcreteCLassA1();
    }

    @Override
    ClassB createCLassB() {
        return new  ConcreteClassB1();
    }
}

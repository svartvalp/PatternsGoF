package com.kasyan313.Patterns.Structural.Facade;

public class Facade {
    AnotherSomeClass anotherSomeClass;
    SomeClass someClass;
    OneAnotherSomeClass oneAnotherSomeClass;
    public void subsystemOperation() {
        anotherSomeClass.doSomeThing();
        someClass.doSomeStuff();
        oneAnotherSomeClass.someLogic();
    }
}

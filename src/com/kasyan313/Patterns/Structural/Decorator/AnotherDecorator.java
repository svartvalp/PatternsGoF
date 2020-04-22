package com.kasyan313.Patterns.Structural.Decorator;

public class AnotherDecorator implements SomeInterface {
    SomeInterface someInterface;

    public AnotherDecorator(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    @Override
    public String comeLogic() {
        return someInterface.comeLogic() + "\n with another decorate logic1111!!11!";
    }
}

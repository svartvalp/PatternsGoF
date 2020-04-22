package com.kasyan313.Patterns.Structural.Decorator;

public class ClassDecorator implements SomeInterface {
    SomeInterface someInterface;

    public ClassDecorator(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    @Override
    public String comeLogic() {
        return someInterface.comeLogic() + " with decorative logic!!!";
    }
}

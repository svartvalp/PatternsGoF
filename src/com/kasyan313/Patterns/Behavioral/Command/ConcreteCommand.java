package com.kasyan313.Patterns.Behavioral.Command;

public class ConcreteCommand {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.doSomeStuff();
    }
}

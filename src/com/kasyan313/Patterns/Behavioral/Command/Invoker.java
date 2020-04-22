package com.kasyan313.Patterns.Behavioral.Command;

public class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}

package com.kasyan313.Patterns.Behavioral.ChainOfResponsibility;

public interface Handler {
    public void setNext(Handler handler);
    public void execute(SomeTask task);
}

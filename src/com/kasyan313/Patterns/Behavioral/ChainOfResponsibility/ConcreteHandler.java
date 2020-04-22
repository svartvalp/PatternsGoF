package com.kasyan313.Patterns.Behavioral.ChainOfResponsibility;

public class ConcreteHandler implements Handler {
    Handler next;
    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void execute(SomeTask task) {
        //doSomeStuff with task or anything else
        if(next != null) {
            next.execute(task);
        }
    }
}

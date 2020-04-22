package com.kasyan313.Patterns.Behavioral.Observer;

public class ConcreteListener implements Listener{
    @Override
    public void handleEvent() {
        System.out.println("Something changed!");
    }
}

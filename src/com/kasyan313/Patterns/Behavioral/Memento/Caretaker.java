package com.kasyan313.Patterns.Behavioral.Memento;

import com.kasyan313.Patterns.Behavioral.Memento.Originator.Memento;

import java.util.LinkedList;


public class Caretaker {
    private LinkedList<Memento> history;
    public Originator originator;

    public void doSomeStuff(String state) {
        history.add(originator.save());
        //change originator
    }

    public void undo() {
        Memento memento = history.pop();
        originator.restore(memento);
    }
}

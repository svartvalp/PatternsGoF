package com.kasyan313.Patterns.Behavioral.Observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    private List<Listener> listeners;

    public Publisher() {
        listeners = new LinkedList<>();
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }
    public void removeListener(Listener listener)  {
        listeners.remove(listener);
    }
    public void notifyListeners() {
        listeners.forEach(listener -> listener.handleEvent());
    }
    public void doSomeStuff() {
        //logic
        notifyListeners();
    }

}

package com.kasyan313.Patterns.Structural.Composite;

import java.util.List;

public class Composite implements Component {
    List<Component> children;
    public void addChild(Component child) {
        children.add(child);
    }

    public void removeChild(Component child) {
        children.remove(child);
    }

    @Override
    public void doStuff() {
        //some logic
        children.forEach(child -> {child.doStuff();});
    }
}

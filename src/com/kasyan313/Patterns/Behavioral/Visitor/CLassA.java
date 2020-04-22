package com.kasyan313.Patterns.Behavioral.Visitor;

public class CLassA implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

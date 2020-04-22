package com.kasyan313.Patterns.Behavioral.Iterator;

import java.util.List;

public class ConcreteCollection<T> implements Collection {
    List<T> items;

    @Override
    public ConcreteIterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}

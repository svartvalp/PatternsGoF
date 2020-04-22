package com.kasyan313.Patterns.Behavioral.Iterator;

public interface Collection<T> {
    public Iterator<T> createIterator();
}

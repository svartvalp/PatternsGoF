package com.kasyan313.Patterns.Behavioral.Iterator;

public class ConcreteIterator<T> implements Iterator<T>{
    ConcreteCollection<T> concreteCollection;

    public ConcreteIterator(ConcreteCollection<T> concreteCollection) {
        this.concreteCollection = concreteCollection;
    }

    @Override
    public boolean hasNext() {
        //do next element check
        return false;
    }

    @Override
    public T next() {
        //do iteration
        return null;
    }
}

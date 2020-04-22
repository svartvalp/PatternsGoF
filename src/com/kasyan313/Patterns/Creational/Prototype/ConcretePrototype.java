package com.kasyan313.Patterns.Creational.Prototype;

public class ConcretePrototype implements Prototype {
    String someField;

    public ConcretePrototype(String someField) {
        this.someField = someField;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    @Override
    public Prototype clone() {
        String cloneField = new String(someField);
        return new ConcretePrototype(cloneField);
    }
}

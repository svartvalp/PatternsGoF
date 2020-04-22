package com.kasyan313.Patterns.Creational.Singleton;

public class Singleton {
    private Singleton instance;

    //method that creates or returns an instance of our Singleton

    public Singleton createInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return  instance;
    }

    //private constructor to make object accessible only from create method

    private Singleton() {

    }
}

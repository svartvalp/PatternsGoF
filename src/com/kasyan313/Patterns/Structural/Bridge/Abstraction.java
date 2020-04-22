package com.kasyan313.Patterns.Structural.Bridge;

public class Abstraction {
    Implementation implementation;
    public void feature1(){
        //logic
        implementation.method1();
    }
    public void feature2(){
        //logic
        implementation.method2();
        implementation.method3();
    }
}

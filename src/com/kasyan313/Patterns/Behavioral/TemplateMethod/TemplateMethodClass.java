package com.kasyan313.Patterns.Behavioral.TemplateMethod;

public abstract class TemplateMethodClass {
    public void step1() {
        //logic
        step2();
    }
    public abstract void step2();
    public abstract void step3();
    public void step4() {
        //logic
    }
}

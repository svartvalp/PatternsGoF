package com.kasyan313.Patterns.Behavioral.TemplateMethod;

public class ConcreteTemplateClass extends TemplateMethodClass {
    @Override
    public void step2() {
        step3();
    }

    @Override
    public void step3() {
        step4();
    }
}

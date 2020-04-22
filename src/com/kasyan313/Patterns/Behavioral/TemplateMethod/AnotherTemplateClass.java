package com.kasyan313.Patterns.Behavioral.TemplateMethod;

public class AnotherTemplateClass extends TemplateMethodClass{
    @Override
    public void step1() {
        step4();
    }

    @Override
    public void step2() {
        step3();
    }

    @Override
    public void step3() {
        step1();
    }

    @Override
    public void step4() {
        step2();
    }
}

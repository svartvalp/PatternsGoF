package com.kasyan313.Patterns.Behavioral.Strategy;

public class StrategyWithOneAlgorithm implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("one algorithm");
    }
}

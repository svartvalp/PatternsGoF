package com.kasyan313.Patterns.Behavioral.Strategy;

public class StrategyWithAnotherAlgorithm implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("another algorithm");
    }
}

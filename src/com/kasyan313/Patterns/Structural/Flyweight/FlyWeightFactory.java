package com.kasyan313.Patterns.Structural.Flyweight;

import java.util.List;

public class FlyWeightFactory {
    private List<FlyWeight> cache;

    public FlyWeight getFlyWeight(String someState, Integer state) {
        for(FlyWeight item : cache) {
            if(item.someState == someState && item.state == state) {
                return item;
            }
        }
        FlyWeight flyWeight = new FlyWeight(someState, state);
        cache.add(flyWeight);
        return  flyWeight;
    }
}

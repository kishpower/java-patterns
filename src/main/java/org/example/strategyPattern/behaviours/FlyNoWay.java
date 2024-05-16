package org.example.strategyPattern.behaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("sorry can't fly!");
    }
}

package org.example.strategyPattern.behaviours;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("flying with wings..");
    }
}

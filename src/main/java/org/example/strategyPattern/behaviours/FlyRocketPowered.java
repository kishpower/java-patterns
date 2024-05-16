package org.example.strategyPattern.behaviours;

public class FlyRocketPowered implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("flying with rockets yay!...");
    }
}

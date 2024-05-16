package org.example.strategyPattern.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeaking ..");
    }
}

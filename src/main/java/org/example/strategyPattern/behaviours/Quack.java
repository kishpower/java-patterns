package org.example.strategyPattern.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("really quacking..");
    }
}

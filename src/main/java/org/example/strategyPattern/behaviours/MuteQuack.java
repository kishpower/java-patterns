package org.example.strategyPattern.behaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("i can't quack ...");
    }
}

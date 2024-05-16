package org.example.strategyPattern;

import org.example.strategyPattern.behaviours.FlyNoWay;
import org.example.strategyPattern.behaviours.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void swim() {
        System.out.println("rubberduck swimming...");
    }

    @Override
    public void display() {
        System.out.println("looks like a rubberduck..");
    }
}

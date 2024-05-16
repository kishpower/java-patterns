package org.example.strategyPattern;

import org.example.strategyPattern.behaviours.FlyNoWay;
import org.example.strategyPattern.behaviours.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void swim() {
        System.out.println("decoy duck is swimming..");
    }

    @Override
    public void display() {
        System.out.println("looks like decoy duck");
    }
}

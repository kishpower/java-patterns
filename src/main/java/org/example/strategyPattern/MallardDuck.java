package org.example.strategyPattern;

import org.example.strategyPattern.behaviours.FlyWithWings;
import org.example.strategyPattern.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        System.out.println("hi i am a mallard duck..");
         quackBehaviour = new Quack();
         flyBehaviour = new FlyWithWings();
    }

    @Override
    public void swim() {
        System.out.println("mallard swimming..");
    }

    @Override
    public void display() {
        System.out.println("looks like a mallard..");
    }
}

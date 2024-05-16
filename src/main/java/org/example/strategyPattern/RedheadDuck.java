package org.example.strategyPattern;

import org.example.strategyPattern.behaviours.FlyWithWings;
import org.example.strategyPattern.behaviours.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehaviour= new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void swim() {
        System.out.println("readhead swimming..");
    }

    @Override
    public void display(){
        System.out.println("looks like readhead duck..");
    }
}

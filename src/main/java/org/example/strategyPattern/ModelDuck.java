package org.example.strategyPattern;

import org.example.strategyPattern.behaviours.FlyNoWay;
import org.example.strategyPattern.behaviours.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("model duck swims ..");
    }


    @Override
    public void display() {
        System.out.println("i am a model duck.");
    }
}

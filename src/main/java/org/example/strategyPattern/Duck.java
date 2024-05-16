package org.example.strategyPattern;

import org.example.strategyPattern.behaviours.FlyBehaviour;
import org.example.strategyPattern.behaviours.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public abstract void swim();

    public abstract void display();

    public Duck() {
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}

package org.example;

import org.example.factoryPattern.ChicagoStyleCheesePizza.ChicagoPizzaStore;
import org.example.factoryPattern.NYPizzaStore.NYPizzaStore;
import org.example.factoryPattern.Pizza;
import org.example.factoryPattern.PizzaStore;
import org.example.strategyPattern.Duck;
import org.example.strategyPattern.ModelDuck;
import org.example.strategyPattern.behaviours.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        // Strategy pattern starts here.

//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
//
//        Duck decoy = new DecoyDuck();
//        decoy.performFly();
//        decoy.performQuack();

//        Duck model = new ModelDuck();
//        model.performFly();
//        model.setFlyBehaviour(new FlyRocketPowered());
//        model.performFly();

        //
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("joel ordered a " + pizza.getName());
    }
}
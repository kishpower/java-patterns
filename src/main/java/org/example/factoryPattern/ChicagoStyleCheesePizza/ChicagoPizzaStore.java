package org.example.factoryPattern.ChicagoStyleCheesePizza;

import org.example.factoryPattern.NYPizzaStore.NYStyleCheesePizza;
import org.example.factoryPattern.NYPizzaStore.NYStyleClamPizza;
import org.example.factoryPattern.NYPizzaStore.NYStyleVeggiePizza;
import org.example.factoryPattern.Pizza;
import org.example.factoryPattern.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if (type.equals("clam")){
            return  new NYStyleClamPizza();
        }else return null;
    }
}

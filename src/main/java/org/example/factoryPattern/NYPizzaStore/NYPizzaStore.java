package org.example.factoryPattern.NYPizzaStore;

import org.example.factoryPattern.CheesePizza;
import org.example.factoryPattern.Ingredients.NYPizzaIngredientsFactory;
import org.example.factoryPattern.Ingredients.PizzaIngredientsFactory;
import org.example.factoryPattern.Pizza;
import org.example.factoryPattern.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("new york style cheese pizza");
       }else if (type.equals("veggie")){
           return new NYStyleVeggiePizza();
       }else if (type.equals("clam")){
           return  new NYStyleClamPizza();
       }
        return pizza;
    }
}

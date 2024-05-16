package org.example.factoryPattern;

import org.example.factoryPattern.Ingredients.PizzaIngredientsFactory;

public class CheesePizza extends Pizza{
    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    PizzaIngredientsFactory ingredientsFactory;
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }

}

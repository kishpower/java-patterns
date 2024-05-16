package org.example.factoryPattern.Ingredients;

public interface PizzaIngredientsFactory {
    public Dough createDough();
    public Sauce createSauce();

    public Cheese createCheese();

   public Veggies[] createVeggies();
   public Pepperoni createPepperoni();
   public Clams createClams();

}

package org.example.factoryPattern.ChicagoStyleCheesePizza;

import org.example.factoryPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {

    }

    @Override
   public void cut(){
       System.out.println("cutting the pizza into square slices");
   }
}

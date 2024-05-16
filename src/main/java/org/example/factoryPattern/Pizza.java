package org.example.factoryPattern;

import org.example.factoryPattern.Ingredients.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

   protected Veggies veggies[];
   protected Pepperoni pepperoni;
   protected Cheese cheese;
   protected Clams clams;

    public abstract void prepare();


    public void bake() {
        System.out.println("baking at 350 c ..");

    }

    public void cut() {
        System.out.println("cutting pizza into diagonal slices ..");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", pepperoni=" + pepperoni +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void box() {
        System.out.println("place pizza in official PizzaStore box");
    }
}


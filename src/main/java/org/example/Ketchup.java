package org.example;

public class Ketchup extends HamburguerDecorator{

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoIngrediente(){
        return 7.0f;
    }
}

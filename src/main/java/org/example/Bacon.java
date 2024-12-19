package org.example;

public class Bacon extends HamburguerDecorator{

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoIngrediente(){
        return 20.0f;
    }
}

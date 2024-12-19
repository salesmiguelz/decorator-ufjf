package org.example;

public class Queijo extends HamburguerDecorator{

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoIngrediente(){
        return 10.0f;
    }
}

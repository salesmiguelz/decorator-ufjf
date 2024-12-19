package org.example;

public class Salada extends HamburguerDecorator{

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public float getPrecoIngrediente(){
        return 5.0f;
    }
}

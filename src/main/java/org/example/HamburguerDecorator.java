package org.example;

public abstract class HamburguerDecorator implements Ingrediente {
    private Ingrediente ingrediente;

    public HamburguerDecorator(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public abstract float getPrecoIngrediente();

    public float getPreco(){
        return this.ingrediente.getPreco() + this.getPrecoIngrediente();
    }
}

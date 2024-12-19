package org.example;

public class HamburguerBase implements Ingrediente{
    public float preco;

    public HamburguerBase(){

    }
    public HamburguerBase(float preco){
        this.preco = preco;
    }
    @Override
    public float getPreco() {
        return preco;
    }
}

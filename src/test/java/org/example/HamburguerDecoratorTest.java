package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {
    @Test
    void deveRetornarValorHamburguerBase(){
        Ingrediente ingrediente = new HamburguerBase(20);
        assertEquals(20.0f, ingrediente.getPreco());
    }

    @Test
    void deveRetornarValorHamburguerBaseComQueijo(){
        Ingrediente ingrediente = new Queijo(new HamburguerBase(20));
        assertEquals(30.0f, ingrediente.getPreco());
    }
    @Test
    void deveRetornarValorHamburguerBaseComQueijoEBacon(){
        Ingrediente ingrediente = new Bacon(new Queijo(new HamburguerBase(20)));
        assertEquals(50.0f, ingrediente.getPreco());
    }
    @Test
    void deveRetornarValorHamburguerBaseComQueijoBaconESalada(){
        Ingrediente ingrediente = new Salada(new Bacon(new Queijo(new HamburguerBase(20))));
        assertEquals(55.0f, ingrediente.getPreco());
    }
    @Test
    void deveRetornarValorHamburguerBaseComQueijoBaconSaladaEKetcup(){
        Ingrediente ingrediente = new Ketchup(new Salada(new Bacon(new Queijo(new HamburguerBase(20)))));
        assertEquals(62.0f, ingrediente.getPreco());
    }
}
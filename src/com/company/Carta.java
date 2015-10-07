package com.company;

/**
 * Created by Nadin on 23/09/15.
 */
public class Carta {
    private NaipesValidas naipe;
    private NumerosValidos numero;
    public Carta(NaipesValidas naipe, NumerosValidos numero){
        this.naipe = naipe;
        this.numero = numero;
    }
    public String toString(){
        return this.numero + " de " + this.naipe;
    }

}

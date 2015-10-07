package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nadin on 23/09/15.
 */

public class Baralho {
    private ArrayList<Carta> cartasBaralho = new ArrayList<Carta>();

    public Baralho(){
        for (NaipesValidas naipe : NaipesValidas.values()){
            for (NumerosValidos numero : NumerosValidos.values()){
                cartasBaralho.add(new Carta(naipe, numero));
            }
        }
        embaralha();
    }

    private void embaralha(){
        Collections.shuffle(cartasBaralho);
    }

    public List<Carta> darCartas(){
        ArrayList<Carta> mao = new ArrayList<Carta>();
        mao.addAll(cartasBaralho.subList(0,3));
        cartasBaralho.removeAll(mao);
        return mao;
    }

    public String toString(){
        return "Cartas:" + cartasBaralho;
    }

    public Integer getBaralhoSize(){
        return cartasBaralho.size();
    }
}

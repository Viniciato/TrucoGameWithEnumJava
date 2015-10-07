package com.company;

public class Main {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho);
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Mão " + (i+1) + ":" + baralho.darCartas());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Chega de truco, sobraram apenas " + (baralho.getBaralhoSize()) + " carta(s)");
        }
    }
}

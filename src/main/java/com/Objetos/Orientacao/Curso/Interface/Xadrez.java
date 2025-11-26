package com.Objetos.Orientacao.Curso.Interface;

public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Montando tabuleiro");
        System.out.println("escolha sua peça");
    }

    @Override
    public void fechar() {
        System.out.println("CHECK MATE");
        System.out.println("limpando tabuleiro");

    }
}

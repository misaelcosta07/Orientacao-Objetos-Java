package com.Objetos.Orientacao.Curso.Interface;

public class VideoGame {
    private Jogo jogo;

    public void ligar(){
        System.out.println("ligando o videogame.");
    }
    public void jogar(Jogo jogo){
        System.out.println("inciando o  jogo");
        this.jogo = jogo;
        jogo.jogar();
    }
    public void fechar(){
        System.out.println("fechando jogo");
        if(jogo != null){
            jogo.fechar();
            jogo = null ; // valor de nulo nao esta rodando
        }else {
            System.out.println("Nao tem nenhum jogo rodando");
        }

    }
}

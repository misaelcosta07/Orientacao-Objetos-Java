package com.Objetos.Orientacao.Curso.Interface;

public class PingPong  implements Jogo {

    // metodos para 'jogar'
    @Override
    public void jogar() {
        System.out.println("tocando musica de entrada");
        System.out.println("podemos começar?");
    }

    @Override
    public void fechar() {
        System.out.println("Parando de tocar musica");
        System.out.println("finalizar jogo?");

    }
}

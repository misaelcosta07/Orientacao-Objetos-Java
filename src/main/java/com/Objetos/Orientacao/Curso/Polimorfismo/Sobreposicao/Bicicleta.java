package com.Objetos.Orientacao.Curso.Polimorfismo.Sobreposicao;

public class Bicicleta extends Transporte{

    @Override
    public void mover() {
        System.out.println("Bicicleta: Pedalando pelas ruas");
    }
}

package com.Objetos.Orientacao.Curso.Polimorfismo.Sobreposicao;

public class Carro extends Transporte{

    @Override
    public void mover() {
        System.out.println("Carro: Dirigindo pela estrada");
    }
}

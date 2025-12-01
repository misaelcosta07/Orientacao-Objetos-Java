package com.Objetos.Orientacao.Curso.Polimorfismo.Sobreposicao;

public class RunTransportes {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }

}

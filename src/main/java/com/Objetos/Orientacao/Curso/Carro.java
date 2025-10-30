package com.Objetos.Orientacao.Curso;

public class Carro {

    String marca;
    String modelo;
    int numpassageiros;
    double capcombustivel; // capacidade de armazenamento de combustivel
    double conscombustivel;  // consumo de combutivel por KM/H


    void exibirautonomia(){

        System.out.println("A autonomia do carro é:" + capcombustivel * conscombustivel + "KM/h");
    }
}


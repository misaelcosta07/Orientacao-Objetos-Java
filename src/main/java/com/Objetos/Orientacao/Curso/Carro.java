package com.Objetos.Orientacao.Curso;

public class Carro {

        String marca;
        String modelo;
        int numpassageiros;
        double capcombustivel; // capacidade de armazenamento de combustivel
        double conscombustivel;  // consumo de combutivel por KM/H


    public static void main(String[] args){

        Carro carro = new Carro();

        carro.marca = "civic";
        carro.modelo = "honda";
        carro.numpassageiros = 5;
        carro.capcombustivel = 50;
        carro.conscombustivel = 10;


    }
    void exibirautonomia(){

        System.out.println("A autonomia do carro é:" + capcombustivel * conscombustivel + "KM/h");
    }

    double obterautonomia() {
        System.out.println("Método obterautonomia foi chamado.");
        return capcombustivel * conscombustivel;
    }
}






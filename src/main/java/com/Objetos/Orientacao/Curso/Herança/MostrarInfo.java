package com.Objetos.Orientacao.Curso.Herança;

public class MostrarInfo {
    public static void main(String[] args) {
        Filha1Pai filha1Pai = new Filha1Pai();
        Filha2Pai filha2Pai = new Filha2Pai();

        filha1Pai.setCabelo("Castanho");
        filha1Pai.setCorDaPele("Branca");
        filha1Pai.setIdade(21);

        System.out.println("Informaçoes filha 1");
        filha1Pai.exibirInfoFilha1("maria");
        filha1Pai.exibirCorCabelo();
        filha1Pai.exibirCorPele();
        filha1Pai.exibirIdade();


        filha2Pai.setCabelo("Loiro");
        filha2Pai.setCorDaPele("Morena");
        filha2Pai.setIdade(24);

        System.out.println();

        System.out.println("Informaçoes filha 2");
        filha2Pai.exibirInfoFilha2("Marta");
        filha2Pai.exibirIdade();
        filha2Pai.exibirCorCabelo();
        filha2Pai.exibirCorPele();

    }
}

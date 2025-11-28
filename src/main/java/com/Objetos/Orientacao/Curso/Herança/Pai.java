package com.Objetos.Orientacao.Curso.Herança;

public class Pai {

    private String cabelo;
    private String corDaPele;
    private int idade;

    public void exibirCorCabelo(){
        System.out.println("Cor do seu cabelo é: "+ getCabelo());
    }
    public void exibirCorPele(){
        System.out.println("Cor da sua pele é: "+ getCorDaPele());
    }
    public void exibirIdade(){
        System.out.println("Sua idade é: "+ getIdade());
    }

    // metodos get e set

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

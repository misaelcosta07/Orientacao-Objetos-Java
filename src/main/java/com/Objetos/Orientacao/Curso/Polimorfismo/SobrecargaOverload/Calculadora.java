package com.Objetos.Orientacao.Curso.Polimorfismo.SobrecargaOverload;

public class Calculadora {

    // metodos
    public int somar(int n1, int n2){
        int soma = n1 + n2;
        System.out.println("soma metodo 2 inteiros: "+soma);
        return soma;
    }
    public double somar(double n1, double n2){
        double soma = n1 + n2;
        System.out.println("soma metodo 2 double: "+soma);
        return soma;
    }
    public int somar(int n1, int n2, int n3){
        int soma = n1 + n2 + n3;
        System.out.println("soma metodo 3 inteiros: "+soma);
        return soma;
    }
}

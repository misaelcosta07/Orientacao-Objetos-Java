package com.Objetos.Orientacao.Curso.Polimorfismo.SobrecargaOverload;

public class ExecuteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(10,20);
        calculadora.somar(11.50,12.50);
        calculadora.somar(10,20,30);
    }
}

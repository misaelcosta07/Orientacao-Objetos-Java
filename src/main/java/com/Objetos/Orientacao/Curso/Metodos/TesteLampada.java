package com.Objetos.Orientacao.Curso.Metodos;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        System.out.println("Lâmpada está:"+ lampada.ligada);

        lampada.desligar();
        System.out.println("lampada está:"+ lampada.ligada);
    }
}

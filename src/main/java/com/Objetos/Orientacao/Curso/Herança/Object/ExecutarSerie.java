package com.Objetos.Orientacao.Curso.Herança.Object;

public class ExecutarSerie {

    public static void main(String[] args) {

        Serie serie = new Serie("String thinks", 5, 38);
        Desenho desenho = new Desenho("looney tones", 4, 50);

        // sobrepor o metodo toString
        System.out.println("Descriçao serie");
        System.out.println(serie);

        System.out.println("Descriçao desenho");
        System.out.println(desenho);


    }
}

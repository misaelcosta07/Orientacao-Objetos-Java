package com.Objetos.Orientacao.Curso.ClassesMetodos;

public class LampadaVenda {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.marca= "Lumena";
        lampada.modelo= "Led";
        lampada.consumo= "Baixissimo";
        lampada.preco= 20.99;

        System.out.println(lampada); // gera somente o endereço de memoria.
        // vai gerar os valores iniciados!
        System.out.println(lampada.marca);
        System.out.println(lampada.modelo);
        System.out.println(lampada.consumo);
        System.out.println("R$"+ lampada.preco);


    }

}

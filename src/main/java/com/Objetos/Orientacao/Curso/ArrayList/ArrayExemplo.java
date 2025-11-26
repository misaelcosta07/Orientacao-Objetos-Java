package com.Objetos.Orientacao.Curso.ArrayList;

import java.util.ArrayList;

public class ArrayExemplo {

    public static void main(String[] args) {

        //arrayestatico
        String[] nome = new String[6];
        nome[0] = "goku";
        nome[1] = "rick";
        nome[2] = "morty";
        nome[3] = "vegeta";
        nome[4] = "saiajin";
        nome[5] = "morkin";

        // arraylist<tipo> nome = new arraylist<tipo>();

        ArrayList<String> dinamico = new ArrayList<String>();
        dinamico.add("goku");
        dinamico.add("rick");
        dinamico.add("morty");
        dinamico.add("bart");
        dinamico.add("simpson");
        dinamico.add("batman");

        // mostrar arrayestatico
        System.out.println("Mostrando arrays estaticos");
        for(int i=0; i< nome.length; i++){
            System.out.println(nome[i]);
        }

        // Mostrar arraydinamico
        // usamos size
        System.out.println("Mostrando os arrays dinamicos");
        for(int i=0; i< dinamico.size(); i++){
            System.out.println(dinamico.get(i));
        }
        System.out.println();
        // usando for each
        System.out.println("imprimindo com for each");
        for(String name: dinamico){
            System.out.println(name);
        }
    }
}

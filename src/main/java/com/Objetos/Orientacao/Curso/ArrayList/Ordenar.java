package com.Objetos.Orientacao.Curso.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {

    public static void main(String[] args) {
        ArrayList<Integer> ordem = new ArrayList<Integer>();

        ordem.add(20);
        ordem.add(30);
        ordem.add(40);
        ordem.add(50);
        ordem.add(24);
        ordem.add(-85);
        ordem.add(-34);

       // System.out.println("Ordem crescente");
        //Collections.sort(ordem);
        System.out.println("Ordem descrescente");
        Collections.sort(ordem, Collections.reverseOrder());

        for(Integer cresc : ordem){
            System.out.println(cresc);
        }

    }
}

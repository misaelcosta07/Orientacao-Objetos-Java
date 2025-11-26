package com.Objetos.Orientacao.Curso.ArrayList;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        ArrayList<Integer> numero = new ArrayList<Integer>();

        numero.add(20);
        numero.add(30);
        numero.add(40);
        numero.add(50);

        System.out.println("Arrays de integer");
        for(Integer num : numero){
            System.out.println(num);
        }


        ArrayList<Double> dinner = new ArrayList<Double>();

        dinner.add(29.90);
        dinner.add(69.90);
        dinner.add(59.70);
        dinner.add(69.20);

        System.out.println("Arrays de double");
        for(Double dinheiro : dinner){
            System.out.println(dinheiro);
        }

    }
}

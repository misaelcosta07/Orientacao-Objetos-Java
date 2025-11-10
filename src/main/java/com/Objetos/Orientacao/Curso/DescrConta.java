package com.Objetos.Orientacao.Curso;

import java.sql.SQLOutput;

public class DescrConta {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numDaConta= 22310456;
        contaCorrente.saldoConta=500.00;
        contaCorrente.statusConta= "Especial";
        contaCorrente.limiteConta= 100.00;

        System.out.println("Descrição da conta:");
        System.out.println(contaCorrente.numDaConta);
        System.out.println("R$"+ contaCorrente.saldoConta);
        System.out.println(contaCorrente.statusConta);
        System.out.println(contaCorrente.limiteConta);

    }

}

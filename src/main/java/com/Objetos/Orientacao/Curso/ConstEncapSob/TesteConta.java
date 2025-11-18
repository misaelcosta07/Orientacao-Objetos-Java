package com.Objetos.Orientacao.Curso.ConstEncapSob;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100.00);
        System.out.println();

        //modificaçao de valores
        contaCorrente.setSaldoAtual(20.00);

        // chamando os metodos
        contaCorrente.sacarDinheiro(contaCorrente.getSaldoConta());
        contaCorrente.depositarDinheiro(contaCorrente.getSaldoAtual());



    }
}

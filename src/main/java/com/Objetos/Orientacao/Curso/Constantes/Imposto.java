package com.Objetos.Orientacao.Curso.Constantes;

public class Imposto {

    private static double valorProduto;

    public static void calcularTotal(){
        Imposto.valorProduto = 45.00;
        double valorTotal = valorProduto + ImpostoCont.TAXA_SERVICO + ImpostoCont.TAXA_GARANTIA;
        System.out.println("Valor do produto: "+ valorProduto);
        System.out.printf("O valor total: %.2f", valorTotal);
    }
}

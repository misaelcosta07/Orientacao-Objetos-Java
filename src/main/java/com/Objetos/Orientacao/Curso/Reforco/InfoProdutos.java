package com.Objetos.Orientacao.Curso.Reforco;
import java.util.Scanner;

public class InfoProdutos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Produtos produtos = new Produtos();

        // for para looping nome do produto
        for(int i=0; i<produtos.nome.length; i++){
            System.out.println("Digite o Produto ");
            produtos.nome[i] = scan.next();
        }
        System.out.println();
        for(int i=0; i< produtos.quantidade.length; i++){
            System.out.println("Digite a quantidade "+ produtos.nome[i]);
            produtos.quantidade[i] = scan.nextInt();
        }
        System.out.println();
        for(int i=0; i<produtos.preco.length; i++){
            System.out.println("Digite o preço "+ produtos.nome[i]);
            produtos.preco[i] = scan.nextDouble();
        }
        System.out.println();
        produtos.mostrarInfo();

        System.out.println();
       produtos.calcularInfo();

        System.out.println();
        produtos.compararValor();


    }
}

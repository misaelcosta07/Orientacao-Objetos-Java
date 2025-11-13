package com.Objetos.Orientacao.Curso.Reforco;

public class Produtos {

    public String [] nome = new String[3];
    public int [] quantidade = new int[3];
    public double [] preco = new double[3];

    //método mostrar informaçoes digitadas
    public void mostrarInfo(){
        for(int i=0; i< nome.length; i++){
            System.out.println("produto "+ nome [i]);
            System.out.println("quantidade "+ quantidade [i]);
            System.out.println("preco "+ preco [i]);
        }
    }
    //método calcular o valor total em estoques
    public void calcularInfo(){
        for(int i=0; i< nome.length; i++){

           double valorTotal = quantidade[i] * preco[i];

            System.out.println("Total de preço no estoque "+ nome[i] + "R$"+ valorTotal);
        }
    }

    //método comparar valor maior em estoque
    public void compararValor() {
        // maiorValortotal começa com 0 porque ainda nenhum produto foi analisado
        double maiorValorTotal = 0;
        // produtoMaior começa vazio porque nao sabemos qual é
        String produtoMaior = "";

        for(int i = 0; i < nome.length; i++) {
            double valortotal = quantidade[i] * preco[i];
            //comparar.
            if (valortotal > maiorValorTotal) {
                maiorValorTotal = valortotal;
                produtoMaior = nome[i];
            }
        }
        System.out.println("Produto com maior valor em estoque: " + produtoMaior);
        System.out.println("Valor R$ " + maiorValorTotal);
    }


}

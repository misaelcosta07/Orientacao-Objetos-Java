package com.Objetos.Orientacao.Curso.ClassesMetodos;

public class DescLivro {

    public static void main(String[] args) {

        Livro livraria = new Livro();

        livraria.nome= "A marquesa";
        livraria.autor= "Nahra mestre";
        livraria.genero= "Romance";
        livraria.categoria= "Adulta";
        livraria.numeroDePaginas= 170;
        livraria.preco= 45.00;

        System.out.println(livraria);
        System.out.println(livraria.nome);
        System.out.println(livraria.autor);
        System.out.println(livraria.genero);
        System.out.println(livraria.categoria);
        System.out.println(livraria.numeroDePaginas +" páginas");
        System.out.println("R$"+ livraria.preco);


    }
}

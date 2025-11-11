package com.Objetos.Orientacao.Curso.ClassesMetodos;

public class LivroDeBiblioteca {
    public static void main(String[] args) {
        Livro livroVenda = new Livro();

        livroVenda.nome= "A marquesa";
        livroVenda.autor= "Nahra mestre";
        livroVenda.preco= 45.00;

        System.out.println("Livro A venda. descriçao:");
        System.out.println("Nome do livro:"+ livroVenda.nome);
        System.out.println("Autor:"+ livroVenda.autor);
        System.out.println("R$"+ livroVenda.preco);
    }
}

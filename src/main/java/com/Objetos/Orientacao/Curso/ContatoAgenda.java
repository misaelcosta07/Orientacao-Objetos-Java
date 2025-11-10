package com.Objetos.Orientacao.Curso;

public class ContatoAgenda {
    public static void main(String[] args) {

        Agenda contato = new Agenda();

        contato.nome="Maria";
        contato.sobrenome="Eduarda";
        contato.apelido="Amor";
        contato.numPais= 55;
        contato.ddd= 21;
        contato.numCelular= 92287654;

        System.out.println("Contato completo:");
        System.out.println(contato.nome);
        System.out.println(contato.sobrenome);
        System.out.println(contato.apelido);
        System.out.println(contato.numPais);
        System.out.println(contato.ddd);
        System.out.println(contato.numCelular);


    }
}

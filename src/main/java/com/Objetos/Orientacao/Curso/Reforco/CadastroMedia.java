package com.Objetos.Orientacao.Curso.Reforco;
import java.util.Scanner;

public class CadastroMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();

     // criar a chamada de 5 alunos com array.
         cadastro.nomeAluno= new String[2];
         for(int i=0; i<cadastro.nomeAluno.length; i++){
             System.out.println("Entre com o nome do aluno");
             cadastro.nomeAluno[i] = scan.next();
         }
        System.out.println();
         // entrar com a nota de cada aluno
        cadastro.notaAluno= new double[2];
         for(int i=0; i<cadastro.notaAluno.length; i++){
             System.out.println("Nota Aluno "+ cadastro.nomeAluno[i]);
             cadastro.notaAluno[i]= scan.nextDouble();
         }

         cadastro.mostrarInfo(cadastro.nomeAluno, cadastro.notaAluno);

    }
}

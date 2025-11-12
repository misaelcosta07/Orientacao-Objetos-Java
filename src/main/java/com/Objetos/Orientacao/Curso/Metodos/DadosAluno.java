package com.Objetos.Orientacao.Curso.Metodos;
import java.util.Scanner;

public class DadosAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno:");
        aluno.nomeAluno = scan.next();
        System.out.println("Entre com o nome do curso:");
        aluno.cursoDoAluno = scan.next();
        System.out.println("Entre com a matricula:");
        aluno.matriculaDoAluno = scan.next();

        // salvar e receber o nome de cada disciplina com array - vetores.
        aluno.disciplinasDoAluno = new String[3];
        // looping para as disciplinas com tamanho 3
        for(int i=0; i<aluno.disciplinasDoAluno.length; i++) {
            System.out.println("Entre com a disciplinas");
            aluno.disciplinasDoAluno[i] = scan.next();
        }
        aluno.notasDisciplina = new double[3][4];
        // salvar e receber as notas do aluno
        for(int i = 0; i<aluno.notasDisciplina.length; i++){
            System.out.println("Entre com a Nota disciplina "+ aluno.disciplinasDoAluno[i]);
            for(int j = 0; j<aluno.notasDisciplina.length; j++){
                System.out.println("Entre com a Nota "+ j);
                aluno.notasDisciplina[i][j] = scan.nextDouble();
            }

        }
        System.out.println();

        aluno.mostrarInfo();
    }
}

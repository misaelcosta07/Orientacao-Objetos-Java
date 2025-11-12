package com.Objetos.Orientacao.Curso.Metodos;

import java.security.spec.RSAOtherPrimeInfo;

public class Aluno {

    public String nomeAluno;
    public String matriculaDoAluno;
    public String cursoDoAluno;
    public String [] disciplinasDoAluno; //declarar como vetores
    public double [] [] notasDisciplina; // declarar uma matriz


    // metodo para informaçao do aluno
    void mostrarInfo(){
        System.out.println("nome:"+ nomeAluno);
        System.out.println("Matricula:"+ matriculaDoAluno);
        System.out.println("Curso:"+ cursoDoAluno);

        for(int i=0; i<notasDisciplina.length; i++){
            System.out.println(disciplinasDoAluno[i]);
            for(int j=0; j<notasDisciplina[i].length; j++){
                System.out.println(notasDisciplina[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

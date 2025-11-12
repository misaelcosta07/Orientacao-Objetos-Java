package com.Objetos.Orientacao.Curso.Reforco;

public class Cadastro {

    // erro que cometi esqueci de delcarar como array aq!! correto agora.
    public String [] nomeAluno;
    public double [] notaAluno;

    // metodo de informaçoes de cada aluno

    void mostrarInfo(String[] nome, double[] notas){
     for(int i=0; i<nomeAluno.length; i++){
         System.out.println("Aluno:"+ nomeAluno[i]+ "\n Nota: "+ notaAluno[i]);

     }

    }
}

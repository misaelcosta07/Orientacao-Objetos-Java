package com.Objetos.Orientacao.Curso.TryCatch;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String texto = sc.nextLine();

        // try catch para validar o numero
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Voce digitou o numero: "+ numero);
        } catch (Exception erro) { // Exception e - conseguimos pegar o nome da class de erro
            System.out.println("Erro: você não digitou um número válido!");
            System.out.println(erro.getMessage());
        }



    }
}

package com.Objetos.Orientacao.Curso.ConstEncapSob;

import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();

        while(true){

            System.out.print("Deseja realizar um saque? (sim / nao): ");
            String resposta = scan.nextLine().toLowerCase();

            if (resposta.equals("nao")) {
                System.out.println("Você optou por não realizar saque.");
                break; // para o while imediatamente
            }

            if (resposta.equals("sim")) {
                System.out.print("Informe o valor do saque: ");
                double valor = scan.nextDouble();
                System.out.println("Processando...\n");
                contaCorrente.realizarSaque(contaCorrente.getSaqueUsuario());


                // Aqui você poderia continuar perguntando mais coisas
            } else {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
            System.out.println("sai do fluxo ");
        }
        }


}

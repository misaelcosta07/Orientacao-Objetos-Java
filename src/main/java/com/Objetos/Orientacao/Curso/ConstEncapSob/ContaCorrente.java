package com.Objetos.Orientacao.Curso.ConstEncapSob;

public class ContaCorrente {

    private int numDaConta;
    private double saldoConta;
    private String statusConta;
    private double limiteConta;
    private double saqueUsuario;

    public ContaCorrente(){
        System.out.println("Descriçao da conta:");
        numDaConta = 123456;
        saldoConta = 250.00;
        statusConta = "Especial";
        limiteConta = 2000;
        System.out.println("Numero da conta: "+ numDaConta);
        System.out.println("Saldo da conta: "+ saldoConta);
        System.out.println("Status da conta: "+ statusConta);
        System.out.println("Limite da conta: "+ limiteConta);

    }

    public void realizarSaque(double saqueUsuario){

            if(saldoConta != 0 || saldoConta > 0){
                System.out.println("voce pode realizar saque.");
            } else if (saqueUsuario > limiteConta) {
                System.out.println("Limite da conta atingido. Seu limite de saque: "+ limiteConta);
            }else {
                System.out.println("Voce Nao pode realizar o saque. valor da conta");
            }

    }
    // metodos getters e setters

    public double getSaqueUsuario() {
        return saqueUsuario;
    }

    public void setSaqueUsuario(double saqueUsuario) {
        this.saqueUsuario = saqueUsuario;
    }
}

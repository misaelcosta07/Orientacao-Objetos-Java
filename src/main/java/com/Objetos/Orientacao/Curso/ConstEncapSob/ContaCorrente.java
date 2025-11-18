package com.Objetos.Orientacao.Curso.ConstEncapSob;

import java.util.Scanner;
public class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    // atributos
    private boolean chequeEspecial;
    private int numDaConta;
    private double saldoConta;
    private String statusConta;
    private int limiteConta;
    private double saldoAtual;

    // construtores
    // executado assim que for executado o metodo, apos o new Nomemetodo();
    public ContaCorrente(double saldoConta){
        System.out.println("Digite seu nome de Usuário:");
        String nome = scan.next();
        System.out.println("Olá "+ nome +" vamos analisar sua conta!");

        // dados da conta
        numDaConta = 12345678;
        this.saldoConta = saldoConta;
        statusConta = "Especial";
        limiteConta = 30000;
        chequeEspecial = false;

        // mostrando dados padrao
        System.out.println(" Numero da conta: "+ numDaConta);
        System.out.println(" Saldo da conta: "+ saldoConta);
        System.out.println(" Status da conta: "+ statusConta);
        System.out.println(" Limite da conta: "+ limiteConta);
        if(chequeEspecial){
            System.out.println("Cheque especial Habilitado");
        }else {
            System.out.println("Cheque especial nao habilitado");
        }

    }
    // metodos especificos
    public double sacarDinheiro(double saldoConta){
        this.saldoConta = saldoConta;
        if(saldoConta !=0 || chequeEspecial == true ){
            System.out.println("Saldo aprovado para saque!");
        }else{
            System.out.println("Saldo reprovado para saque! saldo da conta é: "+ saldoConta);
        }
        return saldoConta;
    }

    public double depositarDinheiro(double saldoAtual){
        this.saldoAtual = saldoAtual;
        if(saldoAtual == 0){
            System.out.println("saldo da conta sem alteraçao. valor depositado"+ saldoAtual);
        }else{
            saldoAtual = saldoConta + saldoAtual;
            System.out.println("Novo Saldo da conta:"+ saldoAtual);
        }
        return saldoAtual;
    }


    //metodos getters setters

    public boolean isChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public int getNumDaConta() {
        return numDaConta;
    }

    public void setNumDaConta(int numDaConta) {
        this.numDaConta = numDaConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    public int getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(int limiteConta) {
        this.limiteConta = limiteConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}

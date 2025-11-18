package com.Objetos.Orientacao.Curso.ConstEncapSob;

public class Lampada {
    // Declarar os Atributos
    private String marca;
    private String modelo;
    private String consumo;
    private double preco;
    private boolean estadoLigar;

    // declarar os metodos especificos
    public void mostrarEstado(){
        if(estadoLigar){
            System.out.println("lampada ligada");
        }else{
            System.out.println("lampada desligada");
        }
    }

    public void mostrarInfo(){
        System.out.println("marca da lampada: "+marca);
        System.out.println("modelo da lampada: "+modelo);
        System.out.println("consumo da lampada: "+consumo);
        System.out.println("preço da lampada: "+preco);
        System.out.println("estado da lampada: "+estadoLigar);

    }

    // declarar os getters e setters

    // estado lamapada
    public boolean isEstadoLigar() {
        return estadoLigar;
    }

    public void setEstadoLigar(boolean estadoLigar) {
        this.estadoLigar = estadoLigar;
    }

    // marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // consumo
    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

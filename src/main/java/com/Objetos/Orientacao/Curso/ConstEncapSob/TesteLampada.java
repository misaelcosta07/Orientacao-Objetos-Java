package com.Objetos.Orientacao.Curso.ConstEncapSob;
import java.util.Scanner;
public class TesteLampada {

    public static void main(String[] args) {
        Lampada lampada= new Lampada();

        lampada.setEstadoLigar(false);
        lampada.setMarca("PowerLight");
        lampada.setModelo("Led/full");
        lampada.setPreco(40.60);
        lampada.setConsumo("Baixissimo");

        lampada.mostrarInfo();


    }
}

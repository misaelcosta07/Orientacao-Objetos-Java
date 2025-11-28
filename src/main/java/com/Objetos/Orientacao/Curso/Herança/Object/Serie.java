package com.Objetos.Orientacao.Curso.Herança.Object;

public class Serie {

    private String name;
    private int temporadas;
    private int episodios;

    // cosntrutor

    public Serie(String name, int temporadas, int episodios) {
        this.name = name;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    // metodos especificos
    // toString();
    public String toString(){
        String info = String.format("Nome da serie: %s \n Temporadas: %d \n Episódios: %d");

        return info;
    }

    // metodos get e set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}

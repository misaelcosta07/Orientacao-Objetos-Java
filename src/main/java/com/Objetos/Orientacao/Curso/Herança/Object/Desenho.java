package com.Objetos.Orientacao.Curso.Herança.Object;

public class Desenho extends Serie{

    private String personagem;

    public Desenho(String name, int temporadas, int episodios ) {
        super(name, temporadas, episodios);
        this.personagem = "Pernalonga";
    }

    @Override
    public String toString(){
        String info = super.toString();// pegou O METODO da class pai com super
        String nomePersonagem = String.format("\nPersonagem: %s",personagem);
        return info + nomePersonagem; // para gerar os valores que eu acrescentei
    }
}

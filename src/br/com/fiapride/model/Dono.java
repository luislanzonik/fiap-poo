package br.com.fiapride.model;

public class Dono {

    private String nome;
    private int idade;

    public Dono(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
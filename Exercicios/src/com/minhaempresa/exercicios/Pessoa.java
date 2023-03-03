package com.minhaempresa.exercicios;

public class Pessoa {
    public String Nome;
    public int Idade;

    // ATRIBUI NOME AO METODO GET
    public String getNome() {
        return this.Nome;
    }
    // ATRIBUI NOME AO METODO SET (String Nome)
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    // ATRIBUI IDADE AO METODO GET
    public int getIdade() {
        return Idade;
    }

    // ATRIBUI IDADE AO METODO SET (int Idade)
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    // CONTRUTOR QUE RECEBE NOME E IDADE
    public Pessoa (String nome, int idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }

    //CONVERTENDO (CASTING) PARA STRING COM METODO toString() TORNANDO O RETURN LEGIVEL

    @Override // (ANOTATION) INDICA UM METODO QUE ESTA SENDO SOBRESCRITO EM UMA CLASSE

    public String toString() {
        return "Nome: " + Nome + ", Idade: " + Idade;
    }

}
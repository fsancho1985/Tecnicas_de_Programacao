package model;

public abstract class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal() {}

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public abstract String exibirInformacoes();

    public abstract void atualizarDadosMedicos(int idade, double peso);
}

package model;

public class AnimalExotico extends Animal {
    private String raca;
    private double peso;
    private String tutor;

    public AnimalExotico(String nome, String especie, int idade, String raca, double peso, String tutor) {
        super(nome, especie, idade);
        this.raca = raca;
        this.peso = peso;
        this.tutor = tutor;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTutor() {
        return tutor;
    }


    @Override
    public String exibirInformacoes() {
        String info = "============================\n" +
                "Informações sobre o animal\n" +
                "Nome: " + getNome() + "\n" +
                "Espécie: " + getEspecie() + "\n" +
                "Raça: " + getRaca() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "Tutor: " + getTutor() + "\n" +
                "============================";
        return info;
    }

    @Override
    public void atualizarDadosMedicos(int idade, double peso) {
        this.setIdade(idade);
        this.setPeso(peso);
    }
}

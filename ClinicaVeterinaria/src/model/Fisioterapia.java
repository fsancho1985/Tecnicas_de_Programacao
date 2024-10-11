package model;

public class Fisioterapia extends ProcedimentosClinicos implements Tratamento {
    private Animal animal;

    public Fisioterapia(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public void realizarTratamento(Animal animal, int idade, double peso) {
        animal.atualizarDadosMedicos(idade, peso);
        System.out.println("Realizado fisioterapia no animal: " +
                getAnimal().exibirInformacoes() +
                "Custo do procedimento: " + getValorProcedimento());
    }
}

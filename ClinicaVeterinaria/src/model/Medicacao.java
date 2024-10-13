package model;

public class Medicacao extends ProcedimentosClinicos implements Tratamento {

    private Animal animal;
    private String tipoMedicacao;

    public Medicacao(Animal animal, String tipoMedicacao) {
        this.animal = animal;
        this.tipoMedicacao = tipoMedicacao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTipoMedicacao() {
        return tipoMedicacao;
    }


    @Override
    public void realizarTratamento(Animal animal, int idade, double peso) {
        animal.atualizarDadosMedicos(idade, peso);
        System.out.println(getAnimal().getNome() + " aplicado medicação: " +
                getTipoMedicacao() +
                "Valor a pagar: " + getValorProcedimento());
    }
}

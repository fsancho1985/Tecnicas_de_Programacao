package model;

public abstract class ProcedimentosClinicos {
    private Animal animal;
    private String descricao;
    private double valorProcedimento;

    public ProcedimentosClinicos() {
        this.animal = animal;
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorProcedimento() {
        return valorProcedimento;
    }

    public void setValorProcedimento(double valorProcedimento) {
        if (this instanceof Cirurgia) {
            this.valorProcedimento = 200.00;
        } else if(this instanceof Fisioterapia) {
            this.valorProcedimento = 100.00;
        } else if(this instanceof Medicacao) {
            this.valorProcedimento = 88;
        } else {
            this.valorProcedimento = 50;
        }
    }
}

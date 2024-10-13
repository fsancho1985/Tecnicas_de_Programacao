package model;

public class Cirurgia extends ProcedimentosClinicos implements Tratamento {

    private Animal animal;
    private String tipoCirurgia;

    public Cirurgia(Animal animal, String tipoCirurgia) {
        super();
        this.animal = animal;
        this.tipoCirurgia = tipoCirurgia;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTipoCirurgia() {
        return tipoCirurgia;
    }


    @Override
    public void realizarTratamento(Animal animal, int idade, double peso) {
        animal.atualizarDadosMedicos(idade, peso);
        System.out.println("Realizado tratamento do tipo: " + getTipoCirurgia() +
                "Valor: " + getValorProcedimento() +
                getAnimal().exibirInformacoes());
    }
}

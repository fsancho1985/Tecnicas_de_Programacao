package model;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Consulta> consultas = new ArrayList<>();
    private ArrayList<ProcedimentosClinicos> tratamentos = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public void marcarConsulta(Consulta consulta) {
        consultas.add(consulta);
        System.out.println("Consulta marcada com sucesso!");
    }

    public void registrarTratamento(ProcedimentosClinicos tratamento) {
        tratamentos.add(tratamento);
        System.out.println("Tratamento registrado");
    }

    public void exibirHistoricoConsulta() {
        for (Consulta consulta : consultas) {
            System.out.println("Animal: " + consulta.getAnimal().getNome() +
                    " Tipo de consulta: " + consulta.getDescricao() +
                    " Data: " + consulta.getData());
        }
    }

    public void exibirHistoricoTratamento() {
        for (ProcedimentosClinicos tratamento : tratamentos) {
            System.out.println("Animal: " + tratamento.getAnimal().getNome() +
                    " tipo de tratamento: " + tratamento.getDescricao());
        }
    }

    public Animal buscarAnimal(ArrayList<Animal> animais, String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    public void calcularCustos() {
        System.out.println("Calculando custos");
    }
}

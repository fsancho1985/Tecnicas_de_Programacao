package model;

import java.util.Date;

public class Exame extends Consulta {
    public Exame(Animal animal, Date data) {
        super(animal, data, "Exame específico");
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Realizado exame específico para " +
                getAnimal() +
                " na data: " +
                getData());
    }
}

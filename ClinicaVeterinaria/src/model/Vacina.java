package model;

import java.util.Date;

public class Vacina extends Consulta {
    public Vacina(Animal animal, Date data, String descricao) {
        super(animal, data, "Vacinação");
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Vacinação no dia: " +
                getData() +
                " no animal: " +
                getAnimal().getNome());
    }


}

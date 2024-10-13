package model;

import java.util.Date;

public class ConsultaRotina extends Consulta {
    public ConsultaRotina(Animal animal, Date data) {
        super(animal, data, "Consulta de rotina");
    }


    @Override
    public void realizarConsulta() {
        System.out.println("Consulta de rotina realizada no dia: " +
                getData() + " no animal " +
                getAnimal().getNome());
    }
}

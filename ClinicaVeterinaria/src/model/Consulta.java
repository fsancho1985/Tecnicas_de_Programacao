package model;

import java.util.Date;

public abstract class Consulta {
    private Animal animal;
    private String descricao;
    private Date data;

    public Consulta(Animal animal, Date data, String descricao) {
        this.animal = animal;
        this.descricao = descricao;
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public abstract void realizarConsulta();


}

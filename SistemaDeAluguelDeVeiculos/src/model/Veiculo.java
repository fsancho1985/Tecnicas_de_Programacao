package model;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private boolean disponivel;
    private double valorDiaria;

    public Veiculo() {}

    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria() {
        if(this instanceof Carro) {
            this.valorDiaria = 90.0;
        } else if (this instanceof Moto) {
            this.valorDiaria = 75.90;
        } else if (this instanceof Aviao) {
            this.valorDiaria = 3500.00;
        } else {
            this.valorDiaria = 70;
        }
    }

    public abstract double calcularValor(int dias);
}

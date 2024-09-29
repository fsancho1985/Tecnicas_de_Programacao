package entities;

import model.Cliente;
import model.Veiculo;

public class RegistroAluguel {
    private Cliente cliente;
    private Veiculo veiculo;
    private int qtdDias;

    public RegistroAluguel(Cliente cliente, Veiculo veiculo, int qtdDias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.qtdDias = qtdDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("=====Registro de Aluguel=====\n");
        sb.append("Cliente: ").append("\n");
        sb.append(getCliente());
        sb.append("Tipo de veículo alugado: ").append("\n");
        sb.append(getVeiculo()).append("\n");
        sb.append("Dias de Aluguel: ").append(getQtdDias()).append("\n");
        return sb.toString();
    }
}



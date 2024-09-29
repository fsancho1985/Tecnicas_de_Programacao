package entities;

import model.Cliente;
import model.Veiculo;

import java.util.LinkedList;

public class Aluguel {
    LinkedList<RegistroAluguel> alugueisAtivos = new LinkedList<>();

    public void alugarVeiculos(Cliente cliente, Veiculo veiculo, int quantidadeDias) {
        if (buscarPorCliente(cliente.getNome())!= null) {
            System.out.println("Este cliente já possuí veículo alugado!");
        } else if (!veiculo.isDisponivel()) {
            System.out.println("Veículo indisponível para alugar");
        } else {
            RegistroAluguel registro = new RegistroAluguel(cliente, veiculo, quantidadeDias);
            alugueisAtivos.add(registro);
            veiculo.setDisponivel(false);
        }
    }

    public RegistroAluguel buscarPorCliente(String nomeCliente) {
        for (RegistroAluguel registro : alugueisAtivos) {
            if (registro.getCliente().getNome().equals(nomeCliente)) {
                return registro;
            }
        }
        return null;
    }

    public void DevolverVeiculo(RegistroAluguel registro, int quantidadeDiasEfetivo) {
        System.out.println(registro);
        if (registro != null) {
            if (registro.getQtdDias() < quantidadeDiasEfetivo) {
                double juros = ((quantidadeDiasEfetivo - registro.getQtdDias())* registro.getVeiculo().getValorDiaria()) * 1.10;
                double totalAPagar = (registro.getVeiculo().calcularValor(quantidadeDiasEfetivo)) + juros;
                System.out.println("Veículo " + registro.getVeiculo().getModelo() + " devolvido pelo cliente: " + registro.getCliente().getNome());
                System.out.println("Quantidade de dias efetivos de aluguel: " + quantidadeDiasEfetivo);
                System.out.println("Total a pagar: R$" + totalAPagar + "\n");
                registro.getVeiculo().setDisponivel(true);
                alugueisAtivos.remove(registro);
            } else {
                double totalAPagar = registro.getVeiculo().calcularValor(quantidadeDiasEfetivo);
                System.out.println("Veículo " + registro.getVeiculo().getModelo() + " devolvido pelo cliente: " + registro.getCliente().getNome());
                System.out.println("Quantidade de dias efetivos de aluguel: " + quantidadeDiasEfetivo);
                System.out.println("Total a pagar: R$" + totalAPagar + "\n");
                registro.getVeiculo().setDisponivel(true);
                alugueisAtivos.remove(registro);
            }

        } else {
            System.out.println("Cliente não possuí veículos alugados.");
        }
    }
}

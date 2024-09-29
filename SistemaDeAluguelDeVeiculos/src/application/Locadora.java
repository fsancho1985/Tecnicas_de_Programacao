package application;

import entities.Aluguel;
import entities.RegistroAluguel;
import model.*;

import java.util.LinkedList;

public class Locadora {
    public static void main(String[] args) {

        LinkedList<Cliente> clientes = new LinkedList<>();
        LinkedList<Veiculo> veiculos = new LinkedList<>();
        LinkedList<RegistroAluguel> alugueis = new LinkedList<>();

        clientes.add(new Cliente("Francisco", "101987654321"));
        clientes.add(new Cliente("Carlos", "101982454321"));
        clientes.add(new Cliente("Se quiser sim", "123456789101"));
        clientes.add(new Cliente("Marcel da Fatec", "22323232323"));

        veiculos.add(new Carro("M3", "BMW", 2024));
        veiculos.add(new Aviao("Cesnas 172", "CESNA", 2020));
        veiculos.add(new Moto("CBR 1000", "Honda", 2019));
        veiculos.add(new Moto("Biz", "Honda", 2010));



        Aluguel aluguel = new Aluguel();
        aluguel.alugarVeiculos(clientes.get(0), veiculos.get(0), 1);
        aluguel.alugarVeiculos(clientes.get(1), veiculos.get(1), 3);
        aluguel.alugarVeiculos(clientes.get(2), veiculos.get(2), 5);
        aluguel.alugarVeiculos(clientes.get(3), veiculos.get(3), 365);

        RegistroAluguel aluguelEfetuado = aluguel.buscarPorCliente("Francisco");
        RegistroAluguel aluguelEfetuado2 = aluguel.buscarPorCliente("Carlos");
        RegistroAluguel aluguelEfetuado3 = aluguel.buscarPorCliente("Se quiser sim");
        RegistroAluguel aluguelEfetuado4 = aluguel.buscarPorCliente("Marcel da Fatec");


        alugueis.add(aluguelEfetuado);
        alugueis.add(aluguelEfetuado2);
        alugueis.add(aluguelEfetuado3);
        alugueis.add(aluguelEfetuado4);


        aluguel.DevolverVeiculo(aluguelEfetuado, 4 );
        aluguel.DevolverVeiculo(aluguelEfetuado2, 3);
        aluguel.DevolverVeiculo(aluguelEfetuado3, 5);
        aluguel.DevolverVeiculo(aluguelEfetuado4, 365);
    }
}

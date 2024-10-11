package application;


import model.Animal;
import model.Cachorro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static Scanner scan = new Scanner(System.in);
    private static List<Animal> animais = new ArrayList<>();


    public static void main(String[] args) {

        Boolean sair = false;

        while(!sair) {
            System.out.println("\n--- Clínica Veterinária ---\n");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Exibir Animais cadastrados");
            System.out.println("3 - Histórico de tratamentos");
            System.out.println("0 - Sair\n");
            System.out.println("Escolha uma opção ");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    exibirAnimais();
                    break;
                case 0:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }

    private static void cadastrarAnimal() {
        System.out.println("\n==== Digite o tipo do animal que deseja cadastrar ====\n");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Ave");
        System.out.println("4 - Animal exótico");

        int tipo = scan.nextInt();
        scan.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Digite o nome do animal: ");
                String nome = scan.nextLine();
                System.out.println("Digite a espécie do animal: ");
                String especie = scan.nextLine();
                System.out.println("Digite a idade do animal: ");
                int idade = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite a raça: ");
                String raca = scan.nextLine();
                System.out.println("Digite o peso (utilize a virgula como separador): ");
                double peso = scan.nextDouble();
                scan.nextLine();
                System.out.println("Digite o nome do tutor: ");
                String tutor = scan.nextLine();
                Animal d = new Cachorro(nome, especie, idade, raca, peso, tutor);
                animais.add(d);
                break;
            case 2:
                System.out.println("Digite o nome do animal: ");
                nome = scan.nextLine();
                System.out.println("Digite a espécie do animal: ");
                especie = scan.nextLine();
                System.out.println("Digite a idade do animal: ");
                idade = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite a raça: ");
                raca = scan.nextLine();
                System.out.println("Digite o peso (utilize a virgula como separador): ");
                peso = scan.nextDouble();
                scan.nextLine();
                System.out.println("Digite o nome do tutor: ");
                tutor = scan.nextLine();
                Animal g = new Cachorro(nome, especie, idade, raca, peso, tutor);
                animais.add(g);
                break;
            case 3:
                System.out.println("Digite o nome do animal: ");
                nome = scan.nextLine();
                System.out.println("Digite a espécie do animal: ");
                especie = scan.nextLine();
                System.out.println("Digite a idade do animal: ");
                idade = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite a raça: ");
                raca = scan.nextLine();
                System.out.println("Digite o peso (utilize a virgula como separador): ");
                peso = scan.nextDouble();
                scan.nextLine();
                System.out.println("Digite o nome do tutor: ");
                tutor = scan.nextLine();
                Animal a = new Cachorro(nome, especie, idade, raca, peso, tutor);
                animais.add(a);
                break;
            case 4:
                System.out.println("Digite o nome do animal: ");
                nome = scan.nextLine();
                System.out.println("Digite a espécie do animal: ");
                especie = scan.nextLine();
                System.out.println("Digite a idade do animal: ");
                idade = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite a raça: ");
                raca = scan.nextLine();
                System.out.println("Digite o peso (utilize a virgula como separador): ");
                peso = scan.nextDouble();
                scan.nextLine();
                System.out.println("Digite o nome do tutor: ");
                tutor = scan.nextLine();
                Animal e = new Cachorro(nome, especie, idade, raca, peso, tutor);
                animais.add(e);
                break;
            default:
                System.out.println("Tipo de animal inválido");
                return;
        }
        System.out.println("Animal cadastrado com sucesso!");

    }


    private static void exibirAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("\n===== Animais cadastrados =====");
            for (Animal animal:animais) {
                System.out.println(animal.exibirInformacoes());
            }
        }
    }
}

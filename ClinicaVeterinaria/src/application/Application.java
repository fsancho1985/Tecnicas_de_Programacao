package application;

import model.*;

import java.util.Date;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Marcar consulta");
            System.out.println("3 - Registrar tratamento");
            System.out.println("4 - Exibir histórico de consultas e tratamentos");
            System.out.println("5 - Calcular custos dos serviços");
            System.out.println("6 - Sair");
            int opt = scan.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("1 - Cadastrar Cachorro");
                    System.out.println("2 - Cadastrar Gato");
                    System.out.println("3 - Cadastrar Ave");
                    System.out.println("4 - Cadastrar Animal Exótico");
                    int optAnimal = scan.nextInt();
                    if (optAnimal == 1) {
                        clinica.cadastrarAnimal(cadastrarAnimal("cachorro"));
                    } else if (optAnimal == 2) {
                        clinica.cadastrarAnimal(cadastrarAnimal("gato"));
                    } else if (optAnimal == 3) {
                        clinica.cadastrarAnimal(cadastrarAnimal("ave"));
                    } else if (optAnimal == 4) {
                        clinica.cadastrarAnimal(cadastrarAnimal("exotico"));
                    }
                    break;
                case 2:
                    System.out.println("1 - Consulta de Rotina");
                    System.out.println("2 - Exame");
                    int optConsulta = scan.nextInt();
                    if (optConsulta == 1) {
                        System.out.println("Qual animal deseja realizar a consulta");
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");
                        System.out.println("3 - Ave");
                        System.out.println("4 - Animal Exótico");
                        int optionAnimal = scan.nextInt();
                        if (optionAnimal == 1) {
                            clinica.marcarConsulta(new ConsultaRotina(cadastrarAnimal("cachorro"), new Date()));
                        } else if (optionAnimal == 2) {
                            clinica.marcarConsulta(new ConsultaRotina(cadastrarAnimal("gato"), new Date()));
                        } else if (optionAnimal == 3) {
                            clinica.marcarConsulta(new ConsultaRotina(cadastrarAnimal("ave"), new Date()));
                        } else if (optionAnimal == 4) {
                            clinica.marcarConsulta(new ConsultaRotina(cadastrarAnimal("exotico"), new Date()));
                        }
                    } else if (optConsulta == 2) {
                        System.out.println("Qual animal deseja realizar o exame");
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");
                        System.out.println("3 - Ave");
                        System.out.println("4 - Animal Exótico");
                        int optionAnimal = scan.nextInt();
                        if (optionAnimal == 1) {
                            clinica.marcarConsulta(new Exame(cadastrarAnimal("cachorro"), new Date()));
                        } else if (optionAnimal == 2) {
                            clinica.marcarConsulta(new Exame(cadastrarAnimal("gato"), new Date()));
                        } else if (optionAnimal == 3) {
                            clinica.marcarConsulta(new Exame(cadastrarAnimal("ave"), new Date()));
                        } else if (optionAnimal == 4) {
                            clinica.marcarConsulta(new Exame(cadastrarAnimal("exotico"), new Date()));
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Selecione o tratamento desejado");
                    System.out.println("1 - Cirurgia");
                    System.out.println("2 - Medicação");
                    System.out.println("3 - Fisioterapia");
                    int optTratamento = scan.nextInt();
                    if (optTratamento == 1) {
                        System.out.println("Qual animal deseja tratar?");
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");
                        System.out.println("3 - Ave");
                        System.out.println("4 - Animal Exótico");
                        int optionAnimal = scan.nextInt();
                        if (optionAnimal == 1) {
                            clinica.registrarTratamento(new Cirurgia(cadastrarAnimal("cachorro"), "Cirurgia"));
                        } else if (optionAnimal == 2) {
                            clinica.registrarTratamento(new Cirurgia(cadastrarAnimal("gato"), "Cirurgia"));
                        } else if (optionAnimal == 3) {
                            clinica.registrarTratamento(new Cirurgia(cadastrarAnimal("ave"), "Cirurgia"));
                        } else if (optionAnimal == 4) {
                            clinica.registrarTratamento(new Cirurgia(cadastrarAnimal("exotico"), "Cirurgia"));
                        }
                    } else if (optTratamento == 2) {
                        System.out.println("Qual animal deseja medicar?");
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");
                        System.out.println("3 - Ave");
                        System.out.println("4 - Animal Exótico");
                        int optionAnimal = scan.nextInt();
                        if (optionAnimal == 1) {
                            clinica.registrarTratamento(new Medicacao(cadastrarAnimal("cachorro"), "Medicação"));
                        } else if (optionAnimal == 2) {
                            clinica.registrarTratamento(new Medicacao(cadastrarAnimal("gato"), "Medicação"));
                        } else if (optionAnimal == 3) {
                            clinica.registrarTratamento(new Medicacao(cadastrarAnimal("ave"), "Medicação"));
                        } else if (optionAnimal == 4) {
                            clinica.registrarTratamento(new Medicacao(cadastrarAnimal("exotico"), "Medicação"));
                        }
                    } else if (optTratamento == 3) {
                        System.out.println("Qual animal deseja realizar fisioterapia?");
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");
                        System.out.println("3 - Ave");
                        System.out.println("4 - Animal Exótico");
                        int optionAnimal = scan.nextInt();
                        if (optionAnimal == 1) {
                            clinica.registrarTratamento(new Fisioterapia(cadastrarAnimal("cachorro")));
                        } else if (optionAnimal == 2) {
                            clinica.registrarTratamento(new Fisioterapia(cadastrarAnimal("gato")));
                        } else if (optionAnimal == 3) {
                            clinica.registrarTratamento(new Fisioterapia(cadastrarAnimal("ave")));
                        } else if (optionAnimal == 4) {
                            clinica.registrarTratamento(new Fisioterapia(cadastrarAnimal("exotico")));
                        }
                    }
                    break;
                case 4:
                    clinica.exibirHistoricoConsulta();
                    break;
                case 5:
                    clinica.calcularCustos();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");

            }
        }
    }

    private static Animal cadastrarAnimal(String tipo) {
        Scanner scan = new Scanner(System.in);
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
        if(tipo == "cachorro") {
            Animal d = new Cachorro(nome, especie, idade, raca, peso, tutor);
            return d;
        } else if (tipo == "gato") {
            Animal d = new Cachorro(nome, especie, idade, raca, peso, tutor);
            return d;
        } else if (tipo == "ave") {
            Animal d = new Cachorro(nome, especie, idade, raca, peso, tutor);
            return d;
        } else if (tipo == "exotico"){
            Animal d = new Cachorro(nome, especie, idade, raca, peso, tutor);
            return d;
        } else {
            System.out.println("Tipo de animal inválido");
        }
        scan.close();
        return null;
    }

}

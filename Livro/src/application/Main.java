package application;

import entities.Livro;
import entities.LivroDigital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de livros que deseja cadastrar:");

        int qtdLivros = scan.nextInt();

        Livro[] biblioteca = new Livro[qtdLivros];

        int parar = 0;
        int posLivro = 0;

        while (parar == 0) {
            System.out.println("O que você deseja fazer? ");
            System.out.println("1 - Cadastrar novo livro");
            System.out.println("2 - Cadastrar novo livro digital");
            System.out.println("3 - Exibir livro");
            System.out.println("4 - Sair");
            int option = scan.nextInt();
            scan.nextLine();
            if (option == 1) {
                if (posLivro >= biblioteca.length) {
                    System.out.println("Biblioteca cheia!");
                } else {
                    System.out.println("Digite os dados do livro que deseja cadastrar: ");
                    System.out.print("Título: ");
                    String titulo = scan.nextLine();
                    System.out.print("Autor: ");
                    String autor = scan.nextLine();
                    System.out.print("Páginas: ");
                    int paginas = scan.nextInt();
                    Livro l = new Livro(titulo, autor, paginas);
                    biblioteca[posLivro] = l;
                    posLivro += 1;
                }
            } else if (option == 2) {
                if (posLivro >= biblioteca.length) {
                    System.out.println("Biblioteca cheia!");
                } else {
                    System.out.println("Digite os dados do livro que deseja cadastrar: ");
                    System.out.print("Título: ");
                    String titulo = scan.nextLine();
                    System.out.print("Autor: ");
                    String autor = scan.nextLine();
                    System.out.print("Páginas: ");
                    int paginas = scan.nextInt();
                    System.out.print("Tamanho em mb: ");
                    double tmb = scan.nextDouble();
                    LivroDigital l = new LivroDigital(titulo, autor, paginas, tmb);
                    biblioteca[posLivro] = l;
                    posLivro += 1;
                }

            } else if (option == 3) {
                System.out.println("=======================================================");
                System.out.println("\t\tTodos os livros cadastrados:\t");
                for (int i = 0; i < posLivro; i++) {
                    System.out.println(biblioteca[i].exibir());
                }
                System.out.println("=======================================================");
            } else {
                return;
            }
        }


//        Livro livro1 = new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 272);
//        Livro livro2 = new Livro("O cão dos Baskerville", "Sir Arthur Conan Doyle", 224);
//        Livro livro3 = new Livro("Pai Rico Pai Pobre", "Robert T. Kiyosaki");
//        Livro livro4 = new Livro("O homem mais rico da babilonia", "George S. Classon");
//        Livro livro5 = new Livro("Mais esperto que o diabo", "Napoleon Hill");
//
//
//        livro1.mostrarInformacoes();
//        livro2.mostrarInformacoes();
//        livro3.mostrarInformacoes();
//        livro4.mostrarInformacoes();
//        livro5.mostrarInformacoes();
//
//        livro3.setPaginas(336);
//        livro4.setPaginas(160);
//        livro5.setPaginas(208);
//
//        livro3.mostrarInformacoes();
//        livro4.mostrarInformacoes();
//        livro5.mostrarInformacoes();
//
//        LivroDigital livroDigital1 = new LivroDigital("Quem pensa enriquece", "Napoleon Hill");
//
//        livroDigital1.mostrarInformacoes();
//        livroDigital1.setPaginas(368);
//        livroDigital1.setTamanhoEmMB(2.3);
//        livroDigital1.mostrarInformacoes();

        scan.close();

    }
}
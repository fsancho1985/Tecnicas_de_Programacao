import placarTop.PlacarBasico;
import placarTop.PlacarFutebol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro time");
        String ta = scan.nextLine();
        System.out.println("Digite o segundo time");
        String tb = scan.nextLine();

        PlacarFutebol pb = new PlacarFutebol(ta, tb);

//        pb.pontuar(0);
//        pb.pontuar(0);
//        pb.pontuar(0);
//        pb.pontuar(1);
        pb.mostrarPlacar();

        scan.close();

    }
}
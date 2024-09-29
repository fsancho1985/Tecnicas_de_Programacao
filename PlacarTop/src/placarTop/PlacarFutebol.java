package placarTop;

public class PlacarFutebol extends PlacarBasico {
    public PlacarFutebol(String timeA, String timeB) {
        super(timeA, timeB);
    }

    @Override
    public void mostrarPlacar() {
        System.out.printf("%s -> %01d\n", this.getNomeTimeA(), this.getPontuacaoA());
        System.out.printf("%s -> %01d\n", this.getNomeTimeB(), this.getPontuacaoB());
    }

}

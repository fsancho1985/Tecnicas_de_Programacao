package placarTop;

public class PlacarBasico {
    private String nomeTimeA;
    private String nomeTimeB;
    private int pontuacaoA;
    private int pontuacaoB;

    public PlacarBasico() {
        this.nomeTimeA = "";
        this.nomeTimeB = "";
        this.pontuacaoA = 0;
        this.pontuacaoB = 0;
    }

    public PlacarBasico(String nomeTimeA, String nomeTimeB) {
        this.nomeTimeA = nomeTimeA;
        this.nomeTimeB = nomeTimeB;
        this.pontuacaoA = 0;
        this.pontuacaoB = 0;
    }

    public String getNomeTimeA() {
        return nomeTimeA;
    }

    public void setNomeTimeA(String nomeTimeA) {
        this.nomeTimeA = nomeTimeA;
    }

    public String getNomeTimeB() {
        return nomeTimeB;
    }

    public void setNomeTimeB(String nomeTimeB) {
        this.nomeTimeB = nomeTimeB;
    }

    public int getPontuacaoA() {
        return pontuacaoA;
    }

    public void setPontuacaoA(int pontuacaoA) {
        this.pontuacaoA = pontuacaoA;
    }

    public int getPontuacaoB() {
        return pontuacaoB;
    }

    public void setPontuacaoB(int pontuacaoB) {
        this.pontuacaoB = pontuacaoB;
    }

    public void mostrarPlacar() {
        System.out.printf("\t%s x %s\n", this.getNomeTimeA(), this.getNomeTimeB());
        System.out.printf("\t%03d x %03d\n", getPontuacaoA(), getPontuacaoB());
    }

    public void pontuar(int timePonto) {
        if (timePonto == 0) {
            this.setPontuacaoA(getPontuacaoA() + 1);
        } else {
            this.setPontuacaoB(getPontuacaoB() + 1);
        }
    }

}

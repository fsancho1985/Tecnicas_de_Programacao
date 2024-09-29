package entities;

public class LivroDigital extends Livro {
    private double tamanhoEmMB;

    public LivroDigital(String titulo, String autor, int paginas, double tamanhoEmMB) {
        super(titulo, autor, paginas);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    public LivroDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    public double getTamanhoEmMB() {
        return tamanhoEmMB;
    }

    public void setTamanhoEmMB(double tamanhoEmMB) {
        this.tamanhoEmMB = tamanhoEmMB;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.printf("\nTítulo: %s\nAutor: %s\nNúmero de páginas: %d\nTamanho em mb: %smb\n\n",
                getTitulo(), getAutor(), getPaginas(), getTamanhoEmMB());
    }

    @Override
    public String exibir() {
        String livroString = super.exibir();
        livroString = livroString + "Tamanho em MB: " + Double.toString(getTamanhoEmMB()) + "mb" + "\n";
        return livroString;
    }
}

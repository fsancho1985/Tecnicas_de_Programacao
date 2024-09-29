package entities;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;


    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarInformacoes() {
        System.out.printf("\nTítulo: %s\nAutor: %s\nNúmero de páginas: %d\n\n",
                getTitulo(), getAutor(), getPaginas());
    }

    public String exibir() {
        String exibicao = "Título: " + getTitulo()+"\n" + "Autor: " + getAutor() + "\n" + "Páginas: "
                + Integer.toString(getPaginas()) + "\n";
        return exibicao;
    }
}

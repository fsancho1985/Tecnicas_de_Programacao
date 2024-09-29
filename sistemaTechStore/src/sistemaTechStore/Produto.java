package sistemaTechStore;

import java.text.DecimalFormat;

public class Produto extends Pagavel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.err.println("O preço deve ser maior que 0. O valor 0 será atribuído ao atributo.");
        }

    }

    public String getDescricao() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Nome: " + this.getNome() + "\nPreço: " + df.format(this.calcularPagamento());
    }

    @Override
    public double calcularPagamento() {
        return this.getPreco();
    }
}

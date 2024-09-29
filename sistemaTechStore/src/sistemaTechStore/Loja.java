package sistemaTechStore;

import java.text.DecimalFormat;
import java.util.LinkedList;

public class Loja {

    private String nome;
    private LinkedList<Produto> estoque;

    public Loja(String nome) {
        this.nome = nome;
        this.estoque = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        this.estoque.add(produto);
    }

    public void listarEstoque() {
        System.out.println("Produtos no estoque: ");
        for (int i = 0; i < this.estoque.size(); i++) {
            System.out.println(this.estoque.get(i).getDescricao());
        }
    }

    public void realizarVenda(Produto produto) {
        boolean vendeu = false;
        for (int i = 0; i < this.estoque.size(); i++) {
            if (this.estoque.get(i).equals(produto)) {
                vendeu = true;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Produto sendo comprado:");
                System.out.println(produto.getDescricao());
                System.out.println("Voce deve pagar o valor de: " + df.format(produto.calcularPagamento()));
                this.estoque.remove(i);
            }
        }
        if (!vendeu) {
            System.out.println("Produto não está em estoque.");
        }

    }

    public void realizarVenda(Produto produto, int quantidade) {
        boolean vendeu = false;
        for (int i = 0; i < this.estoque.size(); i++) {
            if (this.estoque.get(i).equals(produto)) {
                vendeu = true;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Produto sendo comprado:");
                System.out.println(produto.getDescricao());
                System.out.println("Voce deve pagar o valor de: " +
                        df.format(produto.calcularPagamento() * quantidade));
            }
        }
        if (!vendeu) {
            System.out.println("Produto não está no estoque");
        }
    }
}

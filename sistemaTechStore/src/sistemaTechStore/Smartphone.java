package sistemaTechStore;

public class Smartphone extends Eletronico {
    private int armazenamento;

    public Smartphone(String nome, double preco, String marca, int armazenamento) {
        super(nome, preco, marca);
        this.armazenamento = armazenamento;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String getDescricao() {
        String desc = super.getDescricao();
        return desc + "\nTamanho do armazenamento (em GB): " + Integer.toString(this.getArmazenamento());
    }

    @Override
    public double calcularPagamento() {
        double vf = this.getPreco() * 1.1;
        return vf;
    }
}

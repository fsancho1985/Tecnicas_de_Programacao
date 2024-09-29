package sistemaTechStore;

public class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getDescricao(){
        String descEletronico = super.getDescricao();
        descEletronico = descEletronico + "\nMarca: " + this.getMarca();
        return descEletronico;
    }
}

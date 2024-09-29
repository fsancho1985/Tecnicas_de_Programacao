package model;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente() {}

    public Cliente(String nome, String cpf) {
        setNome(nome);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == " ") {
            System.out.println("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nome = ").append(getNome()).append('\n');
        sb.append("Cpf = ").append(getCpf()).append('\n');
        return sb.toString();
    }
}

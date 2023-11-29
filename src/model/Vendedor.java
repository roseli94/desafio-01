package model;

public class Vendedor extends Pessoa {
    private int idCliente;

    public Vendedor(int idCliente, String nome, String cpf, String telefone, String sexo, String endereco) {
        super(nome, cpf, telefone, sexo, endereco);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}

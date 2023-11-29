package model;

public class Cliente extends Pessoa {
    private int idcliente;

    public Cliente(int idcliente, String nome, String cpf, String telefone, String sexo, String endereco) {
        super(nome, cpf, telefone, sexo, endereco);
        this.idcliente = idcliente;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
}

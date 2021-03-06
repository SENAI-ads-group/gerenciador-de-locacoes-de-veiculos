package model.entidades;

/**
 *
 * @author Patrick-Ribeiro
 */
public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    // <editor-fold defaultstate="collapsed" desc="construtores">
    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="getters e setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    // </editor-fold>

    public String toCSV() {
        return nome + ";"
                + telefone + ";"
                + email + ";"
                + endereco.toCSV();
    }

}

package model.entidades;

import java.util.Date;
import util.DateUtilities;

/**
 *
 * @author Patrick-Ribeiro
 */
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String registroGeral;
    private Date dataNascimento;

    // <editor-fold defaultstate="collapsed" desc="construtores">
    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
    }

    public PessoaFisica(String nome, String telefone, String email, Endereco endereco, String cpf, String registroGeral, Date dataNascimento) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.registroGeral = registroGeral;
        this.dataNascimento = dataNascimento;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="getters e setters">
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    // </editor-fold>

    @Override
    public String toCSV() {
        return super.toCSV() + ";"
                + cpf + ";"
                + registroGeral + ";"
                + DateUtilities.formatData(dataNascimento);
    }

}

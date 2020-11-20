package entidades;

import entidades.enums.StatusVeiculo;
import java.util.Date;
import util.DateUtilities;

/**
 *
 * @author usuario
 */
public class Veiculo {

    private Integer id;
    private String placa;
    private String renavam;
    private Categoria categoria;
    private Modelo modelo;
    private Double precoCompra;
    private Double precoVenda;
    private Integer qtdeMaximaPessoas;
    private Date anoFabricacao;
    private Date anoModelo;
    private Double quilometragemRodada;
    private StatusVeiculo statusVeiculo;

    public Veiculo(String placa, String renavam, Categoria categoria, Modelo modelo, Date anoFabricacao, Date anoModelo, Double quilometragemRodada) {
        this.placa = placa;
        this.renavam = renavam;
        this.categoria = categoria;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quilometragemRodada = quilometragemRodada;

        statusVeiculo = StatusVeiculo.INDISPONIVEL;
    }

    public Veiculo(Integer id, String placa, String renavam, Categoria categoria, Modelo modelo, Date anoFabricacao, Date anoModelo, Double quilometragemRodada) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.categoria = categoria;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quilometragemRodada = quilometragemRodada;

        statusVeiculo = StatusVeiculo.INDISPONIVEL;
    }

    public Integer getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQtdeMaximaPessoas() {
        return qtdeMaximaPessoas;
    }

    public void setQtdeMaximaPessoas(Integer qtdeMaximaPessoas) {
        this.qtdeMaximaPessoas = qtdeMaximaPessoas;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Double getQuilometragemRodada() {
        return quilometragemRodada;
    }

    public void setQuilometragemRodada(Double quilometragemRodada) {
        this.quilometragemRodada = quilometragemRodada;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public String toCSV() {
        return "" + id + ";"
                + placa + ";"
                + renavam + ";"
                + categoria.getId() + ";"
                + modelo.getId() + ";"
                + precoCompra + ";"
                + precoVenda + ";"
                + qtdeMaximaPessoas + ";"
                + DateUtilities.formatData(anoFabricacao) + ";"
                + DateUtilities.formatData(anoModelo) + ";"
                + quilometragemRodada + ";"
                + statusVeiculo.toString();
    }

}
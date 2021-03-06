package ui.paineis.formularios;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.entidades.Cliente;
import model.entidades.Locacao;
import model.entidades.Motorista;
import model.entidades.Veiculo;
import model.entidades.enums.StatusVeiculo;
import model.entidades.enums.TipoLocacao;
import model.exceptions.ValidacaoException;
import model.servicos.persistencia.DAOFactory;

/**
 *
 * @author patrick-ribeiro
 */
public final class FormularioLocacao extends javax.swing.JPanel {

    private Locacao locacao;

    public FormularioLocacao(Locacao locacao) {
        initComponents();
        this.locacao = locacao;

        if (comboBoxVeiculo.getModel().getSize() < 1) {
            JOptionPane.showMessageDialog(this, "Não existe nenhum veículo disponível, antes de registrar uma locação disponibilize ou cadastre um veículo",
                    "Veículos disponíveis", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void updateFormData() {
        if (locacao == null) {
            throw new IllegalStateException("a locação está nulo");
        }
        dateChooserEntrega.setDate(locacao.getDataEntrega());
        dateChooserDevolucao.setDate(locacao.getDataDevolucao());
        comboBoxCliente.setSelectedItem(locacao.getCliente());
        comboBoxMotorista.setSelectedItem(locacao.getMotorista());
        comboBoxVeiculo.setSelectedItem(locacao.getVeiculo());
        comboBoxTipoLocacao.setSelectedItem(locacao.getTipo());
    }

    public Locacao getFormData() throws ValidacaoException {
        if (locacao == null) {
            locacao = new Locacao(TipoLocacao.DIARIA);
        }
        clearErrors();
        validarCampos();
        locacao.setDataEntrega(dateChooserEntrega.getDate());
        locacao.setDataDevolucao(dateChooserDevolucao.getDate());
        locacao.setCliente(comboBoxCliente.getItemAt(comboBoxCliente.getSelectedIndex()));
        locacao.setMotorista(comboBoxMotorista.getItemAt(comboBoxMotorista.getSelectedIndex()));
        locacao.setVeiculo(comboBoxVeiculo.getItemAt(comboBoxVeiculo.getSelectedIndex()));
        locacao.setTipo(comboBoxTipoLocacao.getItemAt(comboBoxTipoLocacao.getSelectedIndex()));
        return locacao;
    }

    public void clearErrors() {
        labelErroDataEntrega.setText("");
        labelErroMarca.setText("");
        labelErroDataDevolucao.setText("");
        labelErroCategoria.setText("");
        labelErroTipoLocacao.setText("");
    }

    public void validarCampos() throws ValidacaoException {
        ValidacaoException exception = new ValidacaoException(getClass().getSimpleName());

        if (dateChooserEntrega.getDate() == null) {
            exception.addError("dataEntrega", "Data não informada");
        }
        if (dateChooserEntrega.getDate() == null) {
            exception.addError("dataDevolucao", "Data não informada");
        }
    }

    public void setErrorsMessages(Map<String, String> errors) {
        Set<String> fields = errors.keySet();

        if (fields.contains("descricao")) {
            labelErroDataDevolucao.setText(errors.get("descricao"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelErroMarca = new javax.swing.JLabel();
        labelErroDataDevolucao = new javax.swing.JLabel();
        labelErroDataEntrega = new javax.swing.JLabel();
        comboBoxVeiculo = new javax.swing.JComboBox<>();
        labelErroTipoLocacao = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelErroCategoria = new javax.swing.JLabel();
        comboBoxTipoLocacao = new javax.swing.JComboBox<>();
        comboBoxCliente = new javax.swing.JComboBox<>();
        labelCategoria = new javax.swing.JLabel();
        labelDataEntrega = new javax.swing.JLabel();
        dateChooserEntrega = new com.toedter.calendar.JDateChooser();
        labelErroDataEntrega1 = new javax.swing.JLabel();
        dateChooserDevolucao = new com.toedter.calendar.JDateChooser();
        labelDataEntrega1 = new javax.swing.JLabel();
        labelErroCategoria1 = new javax.swing.JLabel();
        comboBoxMotorista = new javax.swing.JComboBox<>();
        labelMotorista = new javax.swing.JLabel();
        labelCategoria2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(390, 260));
        setPreferredSize(new java.awt.Dimension(390, 260));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelErroMarca.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroMarca.setForeground(java.awt.Color.red);
        labelErroMarca.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroMarca.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroMarca.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, -1, -1));

        labelErroDataDevolucao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroDataDevolucao.setForeground(java.awt.Color.red);
        labelErroDataDevolucao.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroDataDevolucao.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroDataDevolucao.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroDataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, -1, -1));

        labelErroDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroDataEntrega.setForeground(java.awt.Color.red);
        labelErroDataEntrega.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroDataEntrega.setMinimumSize(new java.awt.Dimension(190, 15));
        labelErroDataEntrega.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroDataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, -1, -1));

        comboBoxVeiculo.setModel(new DefaultComboBoxModel(DAOFactory.createVeiculoDAO().buscar(StatusVeiculo.DISPONIVEL).toArray()));
        comboBoxVeiculo.setMinimumSize(new java.awt.Dimension(150, 25));
        comboBoxVeiculo.setPreferredSize(new java.awt.Dimension(200, 25));
        add(comboBoxVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        labelErroTipoLocacao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroTipoLocacao.setForeground(java.awt.Color.red);
        labelErroTipoLocacao.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroTipoLocacao.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroTipoLocacao.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroTipoLocacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        labelMarca.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMarca.setText("Veículo");
        labelMarca.setToolTipText("Veículo a ser locado");
        labelMarca.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        labelErroCategoria.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroCategoria.setForeground(java.awt.Color.red);
        labelErroCategoria.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroCategoria.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroCategoria.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 105, -1, -1));

        comboBoxTipoLocacao.setModel(new DefaultComboBoxModel<>(TipoLocacao.values()));
        comboBoxTipoLocacao.setMinimumSize(new java.awt.Dimension(150, 25));
        comboBoxTipoLocacao.setPreferredSize(new java.awt.Dimension(200, 25));
        add(comboBoxTipoLocacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        comboBoxCliente.setModel(new DefaultComboBoxModel(DAOFactory.createClienteDAO().buscarTodos().toArray()));
        comboBoxCliente.setMinimumSize(new java.awt.Dimension(150, 25));
        comboBoxCliente.setPreferredSize(new java.awt.Dimension(200, 25));
        add(comboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-info-12x12.png"))); // NOI18N
        labelCategoria.setText("Modalidade de precificação");
        labelCategoria.setToolTipText("<html>Modalidade com qual será calculado os custos da locação<br>\n<span>Diária:</span> custos calculados de acordo com a quantidade de dias de locação;<br>\n<span>KM rodado:</span> custos calculados de acordo com a quantidade de quilômetros percorridos pelo veículo no prazo da locação</html>");
        labelCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(labelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        labelDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelDataEntrega.setText("Data de entrega");
        labelDataEntrega.setToolTipText("Data de previsão de entrega do veículo");
        labelDataEntrega.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(labelDataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dateChooserEntrega.setMaxSelectableDate(new java.util.Date(253370779312000L));
        dateChooserEntrega.setMinSelectableDate(new Date());
        dateChooserEntrega.setPreferredSize(new java.awt.Dimension(200, 25));
        add(dateChooserEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        labelErroDataEntrega1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroDataEntrega1.setForeground(java.awt.Color.red);
        labelErroDataEntrega1.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroDataEntrega1.setMinimumSize(new java.awt.Dimension(190, 15));
        labelErroDataEntrega1.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroDataEntrega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, -1, -1));

        dateChooserDevolucao.setMinSelectableDate(new Date());
        dateChooserDevolucao.setPreferredSize(new java.awt.Dimension(200, 25));
        add(dateChooserDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        labelDataEntrega1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelDataEntrega1.setText("Previsão de devolução");
        labelDataEntrega1.setToolTipText("Data de previsão de devolução do veículo");
        labelDataEntrega1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(labelDataEntrega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        labelErroCategoria1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroCategoria1.setForeground(java.awt.Color.red);
        labelErroCategoria1.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroCategoria1.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroCategoria1.setPreferredSize(new java.awt.Dimension(200, 15));
        add(labelErroCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        comboBoxMotorista.setModel(new DefaultComboBoxModel(DAOFactory.createMotoristaDAO().buscarTodos().toArray()));
        comboBoxMotorista.setMinimumSize(new java.awt.Dimension(150, 25));
        comboBoxMotorista.setPreferredSize(new java.awt.Dimension(200, 25));
        add(comboBoxMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        labelMotorista.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelMotorista.setText("Motorista");
        labelMotorista.setToolTipText("Motorista responsável pelo veículo a ser locado");
        labelMotorista.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(labelMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        labelCategoria2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        labelCategoria2.setText("Cliente");
        labelCategoria2.setToolTipText("Cliente responsável pela locação");
        labelCategoria2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(labelCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> comboBoxCliente;
    private javax.swing.JComboBox<Motorista> comboBoxMotorista;
    private javax.swing.JComboBox<TipoLocacao> comboBoxTipoLocacao;
    private javax.swing.JComboBox<Veiculo> comboBoxVeiculo;
    private com.toedter.calendar.JDateChooser dateChooserDevolucao;
    private com.toedter.calendar.JDateChooser dateChooserEntrega;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria2;
    private javax.swing.JLabel labelDataEntrega;
    private javax.swing.JLabel labelDataEntrega1;
    private javax.swing.JLabel labelErroCategoria;
    private javax.swing.JLabel labelErroCategoria1;
    private javax.swing.JLabel labelErroDataDevolucao;
    private javax.swing.JLabel labelErroDataEntrega;
    private javax.swing.JLabel labelErroDataEntrega1;
    private javax.swing.JLabel labelErroMarca;
    private javax.swing.JLabel labelErroTipoLocacao;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelMotorista;
    // End of variables declaration//GEN-END:variables
}

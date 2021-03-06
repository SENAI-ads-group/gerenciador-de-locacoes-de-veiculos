package ui.frames;

import java.awt.Component;
import javax.swing.JOptionPane;
import model.exceptions.DBException;
import ui.listeners.MouseListenerPanelButtonMenu;
import ui.paineis.ListagemChecklist;
import ui.paineis.ListagemDescontos;
import ui.paineis.ListagemTaxas;
import ui.paineis.ListagemCategoria;
import ui.paineis.ListagemClientes;
import ui.paineis.ListagemLocacoes;
import ui.paineis.ListagemMarcas;
import ui.paineis.ListagemModelos;
import ui.paineis.ListagemMotoristas;
import ui.paineis.ListagemVeiculos;
import util.PanelUtilities;

/**
 *
 * @author Patrick-Ribeiro
 */
public class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        initComponents();

        for (Component component : panelMenu.getComponents()) {
            component.addMouseListener(new MouseListenerPanelButtonMenu(component));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLeft = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelMenuItemLocacao = new javax.swing.JPanel();
        labelIconLocacao = new javax.swing.JLabel();
        labelMenuLocacao = new javax.swing.JLabel();
        panelMenuItemChecklist = new javax.swing.JPanel();
        labelIconChecklist = new javax.swing.JLabel();
        labelMenuChecklist = new javax.swing.JLabel();
        panelMenuItemTaxas = new javax.swing.JPanel();
        labelIconTaxas = new javax.swing.JLabel();
        labelMenuTaxas = new javax.swing.JLabel();
        panelMenuItemDescontos = new javax.swing.JPanel();
        labelIconDescontos = new javax.swing.JLabel();
        labelMenuDescontos = new javax.swing.JLabel();
        panelMenuItemClientes = new javax.swing.JPanel();
        labelIconClientes = new javax.swing.JLabel();
        labelMenuClientes = new javax.swing.JLabel();
        panelMenuItemMotoristas = new javax.swing.JPanel();
        labelIconMotoristas = new javax.swing.JLabel();
        labelMenuMotoristas = new javax.swing.JLabel();
        panelMenuItemVeiculos = new javax.swing.JPanel();
        labelIconVeiculos = new javax.swing.JLabel();
        labelMenuVeiculos = new javax.swing.JLabel();
        panelMenuItemModelos = new javax.swing.JPanel();
        labelIconModelos = new javax.swing.JLabel();
        labelMenuModelos = new javax.swing.JLabel();
        panelMenuItemMarcas = new javax.swing.JPanel();
        labelIconMarcas = new javax.swing.JLabel();
        labelMenuMarcas = new javax.swing.JLabel();
        panelMenuItemCategorias = new javax.swing.JPanel();
        labelIconCategorias = new javax.swing.JLabel();
        labelMenuCategorias = new javax.swing.JLabel();
        scrollPaneCenter = new javax.swing.JScrollPane();
        panelCenter = new javax.swing.JPanel();
        panelLoader = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de locações de veículos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-sistema-128x128.png")).getImage());
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        panelLeft.setMinimumSize(new java.awt.Dimension(300, 100));
        panelLeft.setPreferredSize(new java.awt.Dimension(150, 768));
        panelLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setPreferredSize(new java.awt.Dimension(150, 350));
        panelMenu.setLayout(new javax.swing.BoxLayout(panelMenu, javax.swing.BoxLayout.Y_AXIS));

        panelMenuItemLocacao.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemLocacaoMousePressed(evt);
            }
        });
        panelMenuItemLocacao.setLayout(new java.awt.BorderLayout());

        labelIconLocacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-locacao-28x28.png"))); // NOI18N
        labelIconLocacao.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemLocacao.add(labelIconLocacao, java.awt.BorderLayout.LINE_START);

        labelMenuLocacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuLocacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuLocacao.setText("Locação");
        panelMenuItemLocacao.add(labelMenuLocacao, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemLocacao);

        panelMenuItemChecklist.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemChecklist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemChecklistMousePressed(evt);
            }
        });
        panelMenuItemChecklist.setLayout(new java.awt.BorderLayout());

        labelIconChecklist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconChecklist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-vistoria-28x28.png"))); // NOI18N
        labelIconChecklist.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemChecklist.add(labelIconChecklist, java.awt.BorderLayout.LINE_START);

        labelMenuChecklist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuChecklist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuChecklist.setText("Checklist");
        panelMenuItemChecklist.add(labelMenuChecklist, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemChecklist);

        panelMenuItemTaxas.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemTaxas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemTaxasMousePressed(evt);
            }
        });
        panelMenuItemTaxas.setLayout(new java.awt.BorderLayout());

        labelIconTaxas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconTaxas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-taxa-28x28.png"))); // NOI18N
        labelIconTaxas.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemTaxas.add(labelIconTaxas, java.awt.BorderLayout.LINE_START);

        labelMenuTaxas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuTaxas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuTaxas.setText("Taxas");
        panelMenuItemTaxas.add(labelMenuTaxas, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemTaxas);

        panelMenuItemDescontos.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemDescontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemDescontosMousePressed(evt);
            }
        });
        panelMenuItemDescontos.setLayout(new java.awt.BorderLayout());

        labelIconDescontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconDescontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-desconto-28x28.png"))); // NOI18N
        labelIconDescontos.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemDescontos.add(labelIconDescontos, java.awt.BorderLayout.LINE_START);

        labelMenuDescontos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuDescontos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuDescontos.setText("Descontos");
        panelMenuItemDescontos.add(labelMenuDescontos, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemDescontos);

        panelMenuItemClientes.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemClientesMousePressed(evt);
            }
        });
        panelMenuItemClientes.setLayout(new java.awt.BorderLayout());

        labelIconClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-clientes-28x28.png"))); // NOI18N
        labelIconClientes.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemClientes.add(labelIconClientes, java.awt.BorderLayout.LINE_START);

        labelMenuClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuClientes.setText("Clientes");
        panelMenuItemClientes.add(labelMenuClientes, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemClientes);

        panelMenuItemMotoristas.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemMotoristas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemMotoristasMousePressed(evt);
            }
        });
        panelMenuItemMotoristas.setLayout(new java.awt.BorderLayout());

        labelIconMotoristas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconMotoristas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-motorista-28x28.png"))); // NOI18N
        labelIconMotoristas.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemMotoristas.add(labelIconMotoristas, java.awt.BorderLayout.LINE_START);

        labelMenuMotoristas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuMotoristas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuMotoristas.setText("Motoristas");
        panelMenuItemMotoristas.add(labelMenuMotoristas, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemMotoristas);

        panelMenuItemVeiculos.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemVeiculosMousePressed(evt);
            }
        });
        panelMenuItemVeiculos.setLayout(new java.awt.BorderLayout());

        labelIconVeiculos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-veiculo-28x28.png"))); // NOI18N
        labelIconVeiculos.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemVeiculos.add(labelIconVeiculos, java.awt.BorderLayout.LINE_START);

        labelMenuVeiculos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuVeiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuVeiculos.setText("Veículos");
        panelMenuItemVeiculos.add(labelMenuVeiculos, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemVeiculos);

        panelMenuItemModelos.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemModelosMousePressed(evt);
            }
        });
        panelMenuItemModelos.setLayout(new java.awt.BorderLayout());

        labelIconModelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-modelos-28x28.png"))); // NOI18N
        labelIconModelos.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemModelos.add(labelIconModelos, java.awt.BorderLayout.LINE_START);

        labelMenuModelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuModelos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuModelos.setText("Modelos");
        panelMenuItemModelos.add(labelMenuModelos, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemModelos);

        panelMenuItemMarcas.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemMarcasMousePressed(evt);
            }
        });
        panelMenuItemMarcas.setLayout(new java.awt.BorderLayout());

        labelIconMarcas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-marcas-28x28.png"))); // NOI18N
        labelIconMarcas.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemMarcas.add(labelIconMarcas, java.awt.BorderLayout.LINE_START);

        labelMenuMarcas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuMarcas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuMarcas.setText("Marcas");
        panelMenuItemMarcas.add(labelMenuMarcas, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemMarcas);

        panelMenuItemCategorias.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemCategoriasMousePressed(evt);
            }
        });
        panelMenuItemCategorias.setLayout(new java.awt.BorderLayout());

        labelIconCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-categorias-28x28.png"))); // NOI18N
        labelIconCategorias.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemCategorias.add(labelIconCategorias, java.awt.BorderLayout.LINE_START);

        labelMenuCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuCategorias.setText("Categorias");
        panelMenuItemCategorias.add(labelMenuCategorias, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemCategorias);

        panelLeft.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(panelLeft, java.awt.BorderLayout.LINE_START);

        scrollPaneCenter.setBorder(null);
        scrollPaneCenter.setFocusable(false);
        scrollPaneCenter.setRequestFocusEnabled(false);

        panelCenter.setBackground(new java.awt.Color(255, 255, 255));
        panelCenter.setPreferredSize(new java.awt.Dimension(1200, 768));
        panelCenter.setLayout(new java.awt.BorderLayout());

        panelLoader.setBackground(new java.awt.Color(255, 255, 255));
        panelLoader.setPreferredSize(new java.awt.Dimension(1200, 768));
        panelLoader.setLayout(new javax.swing.BoxLayout(panelLoader, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/images/logomarca.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        panelLoader.add(jPanel1);

        panelCenter.add(panelLoader, java.awt.BorderLayout.CENTER);

        scrollPaneCenter.setViewportView(panelCenter);

        getContentPane().add(scrollPaneCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMenuItemMotoristasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemMotoristasMousePressed
        try {
            ListagemMotoristas listMotoristas = new ListagemMotoristas();
            PanelUtilities.loadPanelToPanel(listMotoristas, panelLoader);
            listMotoristas.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemMotoristasMousePressed

    private void panelMenuItemClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemClientesMousePressed
        ListagemClientes listClientes = new ListagemClientes();
        PanelUtilities.loadPanelToPanel(listClientes, panelLoader);
        listClientes.atualizarListagem();
    }//GEN-LAST:event_panelMenuItemClientesMousePressed

    private void panelMenuItemVeiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemVeiculosMousePressed
        try {
            ListagemVeiculos listVeiculos = new ListagemVeiculos();
            PanelUtilities.loadPanelToPanel(listVeiculos, panelLoader);
            listVeiculos.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemVeiculosMousePressed

    private void panelMenuItemModelosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemModelosMousePressed
        try {
            ListagemModelos listModelos = new ListagemModelos();
            PanelUtilities.loadPanelToPanel(listModelos, panelLoader);
            listModelos.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemModelosMousePressed

    private void panelMenuItemMarcasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemMarcasMousePressed
        try {
            ListagemMarcas listMarcas = new ListagemMarcas();
            PanelUtilities.loadPanelToPanel(listMarcas, panelLoader);
            listMarcas.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemMarcasMousePressed

    private void panelMenuItemCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemCategoriasMousePressed
        try {
            ListagemCategoria listCategorias = new ListagemCategoria();
            PanelUtilities.loadPanelToPanel(listCategorias, panelLoader);
            listCategorias.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemCategoriasMousePressed

    private void panelMenuItemLocacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemLocacaoMousePressed
        try {
            ListagemLocacoes listLocacoes = new ListagemLocacoes();
            PanelUtilities.loadPanelToPanel(listLocacoes, panelLoader);
            listLocacoes.updateTable();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemLocacaoMousePressed

    private void panelMenuItemChecklistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemChecklistMousePressed
        try {
            ListagemChecklist listagemChecklist = new ListagemChecklist();
            PanelUtilities.loadPanelToPanel(listagemChecklist, panelLoader);
            listagemChecklist.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemChecklistMousePressed

    private void panelMenuItemTaxasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemTaxasMousePressed
        try {
            ListagemTaxas listagemTaxas = new ListagemTaxas();
            PanelUtilities.loadPanelToPanel(listagemTaxas, panelLoader);
            listagemTaxas.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemTaxasMousePressed

    private void panelMenuItemDescontosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemDescontosMousePressed
        try {
            ListagemDescontos listagemDescontos = new ListagemDescontos();
            PanelUtilities.loadPanelToPanel(listagemDescontos, panelLoader);
            listagemDescontos.atualizarListagem();
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_panelMenuItemDescontosMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIconCategorias;
    private javax.swing.JLabel labelIconChecklist;
    private javax.swing.JLabel labelIconClientes;
    private javax.swing.JLabel labelIconDescontos;
    private javax.swing.JLabel labelIconLocacao;
    private javax.swing.JLabel labelIconMarcas;
    private javax.swing.JLabel labelIconModelos;
    private javax.swing.JLabel labelIconMotoristas;
    private javax.swing.JLabel labelIconTaxas;
    private javax.swing.JLabel labelIconVeiculos;
    private javax.swing.JLabel labelMenuCategorias;
    private javax.swing.JLabel labelMenuChecklist;
    private javax.swing.JLabel labelMenuClientes;
    private javax.swing.JLabel labelMenuDescontos;
    private javax.swing.JLabel labelMenuLocacao;
    private javax.swing.JLabel labelMenuMarcas;
    private javax.swing.JLabel labelMenuModelos;
    private javax.swing.JLabel labelMenuMotoristas;
    private javax.swing.JLabel labelMenuTaxas;
    private javax.swing.JLabel labelMenuVeiculos;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelLoader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuItemCategorias;
    private javax.swing.JPanel panelMenuItemChecklist;
    private javax.swing.JPanel panelMenuItemClientes;
    private javax.swing.JPanel panelMenuItemDescontos;
    private javax.swing.JPanel panelMenuItemLocacao;
    private javax.swing.JPanel panelMenuItemMarcas;
    private javax.swing.JPanel panelMenuItemModelos;
    private javax.swing.JPanel panelMenuItemMotoristas;
    private javax.swing.JPanel panelMenuItemTaxas;
    private javax.swing.JPanel panelMenuItemVeiculos;
    private javax.swing.JScrollPane scrollPaneCenter;
    // End of variables declaration//GEN-END:variables
}

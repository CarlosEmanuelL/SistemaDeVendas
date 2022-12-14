/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.ClienteDAO;
import DTO.ClienteDTO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class frmCadastroClientePAINEL extends javax.swing.JPanel {

    /**
     * Creates new form frmCadastroClienteVIEW
     */
    public frmCadastroClientePAINEL() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtTelefoneCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCepCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        btnVerificar = new javax.swing.JToggleButton();
        btnCadastrar = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnCarregar = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(916, 762));

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 89, 163));
        jLabel1.setText("Cadastro de Clientes");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 89, 163));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 89, 163));
        jLabel3.setText("Endere??o:");

        jLabel4.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 89, 163));
        jLabel4.setText("Telefone:");

        txtTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans CJK HK", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 89, 163));
        jLabel5.setText("CEP:");

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Endere??o", "Telefone", "CEP"
            }
        ));
        jScrollPane1.setViewportView(tabelaCliente);

        jLabel6.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 89, 163));
        jLabel6.setText("ID CLIENTE");

        txtIdCliente.setEnabled(false);

        btnCancelar.setBackground(new java.awt.Color(25, 89, 163));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(25, 89, 163));
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("Verificar");
        btnVerificar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(25, 89, 163));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(25, 89, 163));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(25, 89, 163));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(86, 23));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCarregar.setBackground(new java.awt.Color(25, 89, 163));
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("Carregar");
        btnCarregar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNomeCliente)
                                    .addComponent(txtEnderecoCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        listarValores();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarCliente();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarCliente();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirCliente();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnCarregar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCepCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {

        try {
            ClienteDAO objclientedao = new ClienteDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> lista = objclientedao.ListarCliente();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_cliente(),
                    lista.get(num).getNome_cliente(),
                    lista.get(num).getEndereco_cliente(),
                    lista.get(num).getTelefone_cliente(),
                    lista.get(num).getCep_cliente()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);
        }
    }

    private void LimparCampos() {
        txtNomeCliente.setText("");
        txtEnderecoCliente.setText("");
        txtTelefoneCliente.setText("");
        txtCepCliente.setText("");
        txtNomeCliente.requestFocus();
    }

    private void CarregarCampos() {
        int setar = tabelaCliente.getSelectedRow();

        txtIdCliente.setText(tabelaCliente.getModel().getValueAt(setar, 0).toString());
        txtNomeCliente.setText(tabelaCliente.getModel().getValueAt(setar, 1).toString());
        txtEnderecoCliente.setText(tabelaCliente.getModel().getValueAt(setar, 2).toString());
        txtTelefoneCliente.setText(tabelaCliente.getModel().getValueAt(setar, 3).toString());
        txtCepCliente.setText(tabelaCliente.getModel().getValueAt(setar, 4).toString());

    }

    private void AlterarCliente() {
        int id_cliente;
        String nomeCliente, enderecoCliente, telefoneCliente, cepCliente;

        id_cliente = Integer.parseInt(txtIdCliente.getText());
        nomeCliente = txtNomeCliente.getText();
        enderecoCliente = txtEnderecoCliente.getText();
        telefoneCliente = txtTelefoneCliente.getText();
        cepCliente = txtCepCliente.getText();

        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setId_cliente(id_cliente);
        objclientedto.setNome_cliente(nomeCliente);
        objclientedto.setEndereco_cliente(enderecoCliente);
        objclientedto.setTelefone_cliente(telefoneCliente);
        objclientedto.setCep_cliente(cepCliente);

        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.alterarCliente(objclientedto);

    }

    private void CadastrarCliente() {
        String nomeCliente, enderecoCliente, telefoneCliente, cepCliente;

        nomeCliente = txtNomeCliente.getText();
        enderecoCliente = txtEnderecoCliente.getText();
        telefoneCliente = txtTelefoneCliente.getText();
        cepCliente = txtCepCliente.getText();

        ClienteDTO objclientedto = new ClienteDTO();

        objclientedto.setNome_cliente(nomeCliente);
        objclientedto.setEndereco_cliente(enderecoCliente);
        objclientedto.setTelefone_cliente(telefoneCliente);
        objclientedto.setCep_cliente(cepCliente);

        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.cadastrarCliente(objclientedto);
    }

    private void ExcluirCliente() {
        int id_cliente;
        String nomeCliente, enderecoCliente, telefoneCliente, cepCliente;

        id_cliente = Integer.parseInt(txtIdCliente.getText());
        nomeCliente = txtNomeCliente.getText();
        enderecoCliente = txtEnderecoCliente.getText();
        telefoneCliente = txtTelefoneCliente.getText();
        cepCliente = txtCepCliente.getText();

        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setId_cliente(id_cliente);
        objclientedto.setNome_cliente(nomeCliente);
        objclientedto.setEndereco_cliente(enderecoCliente);
        objclientedto.setTelefone_cliente(telefoneCliente);
        objclientedto.setCep_cliente(cepCliente);

        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.excluirCliente(objclientedto);
    }

}
